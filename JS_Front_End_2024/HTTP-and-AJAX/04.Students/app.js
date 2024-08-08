const url = "http://localhost:3030/jsonstore/collections/students";
const table = document.querySelector("tbody");

function attachEvents() {
  
  loadStudents();

  document.querySelector("#submit").addEventListener("click", createStudent);

}
function loadStudents(){
  table.innerHTML = '';
  fetch(url)
    .then(res => res.json())
      .then(data =>{
          for(let entry in data){
            const tr = document.createElement('tr');
            tr.appendChild(getTableData(data[entry].firstName));
            tr.appendChild(getTableData(data[entry].lastName));
            tr.appendChild(getTableData(data[entry].facultyNumber));
            tr.appendChild(getTableData(data[entry].grade));
          
            table.appendChild(tr);
          }      
      });
}

function getTableData(data){
  let td = document.createElement('td');
  td.textContent = `${data}`;
  return td;
}
function createStudent(){
  const firstName = document.querySelector("input[name=firstName").value;
  const lastName = document.querySelector("input[name=lastName").value;
  const facultyNumber = document.querySelector("input[name=facultyNumber").value;
  const grade = document.querySelector("input[name=grade").value;

  if(firstName === '' || lastName === '' || facultyNumber === '' || grade === ''){
    return;
  } else {fetch(url, {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify({
      firstName: firstName,
      lastName: lastName,
      facultyNumber: facultyNumber,
      grade: grade
    })
  })
  .then(data => {

    document.querySelector("input[name=firstName").value = '';
    document.querySelector("input[name=lastName").value = '';
    document.querySelector("input[name=facultyNumber").value = '';
    document.querySelector("input[name=grade").value = '';

    loadStudents();
  })
}}

attachEvents();