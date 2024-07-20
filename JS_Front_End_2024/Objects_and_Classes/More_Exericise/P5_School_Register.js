function solve(input){
    let register = [];

    for(let line of input){
        let tokens = line.split(', ');
        let name = tokens[0].split(': ')[1];
        let grade = tokens[1].split(': ')[1];
        let average = parseFloat(tokens[2].split(': ')[1]);

        if (average >= 3) {
            let gradeSort = {
                students: name,
                grade: parseInt(grade) + 1,
                average: average,
                count: 1
            };

            const student = register.find(student => student.grade === gradeSort.grade);

            if (student) {
                student.students += ', ' + name;
                student.count++;
                student.average = ((student.average * (student.count - 1)) + average) / student.count;
            } else {
                register.push(gradeSort);
            }
    }
    }

    register.sort((a,b) => a['grade'] - b['grade']);

    for(let student of register){
        console.log(`${student.grade} Grade`);
        console.log(`List of students: ${student.students}`);
        console.log(`Average annual score from last year: ${student.average.toFixed(2)}`);
        console.log('');
    }
}

solve([
    'Student name: George, Grade: 5, Graduated with an average score: 2.75',
    'Student name: Alex, Grade: 9, Graduated with an average score: 3.66',
    'Student name: Peter, Grade: 8, Graduated with an average score: 2.83',
    'Student name: Boby, Grade: 5, Graduated with an average score: 4.20',
    'Student name: John, Grade: 9, Graduated with an average score: 2.90',
    'Student name: Steven, Grade: 2, Graduated with an average score: 4.90',
    'Student name: Darsy, Grade: 1, Graduated with an average score: 5.15'
    ]);