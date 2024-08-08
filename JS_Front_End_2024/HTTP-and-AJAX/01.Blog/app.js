function attachEvents() {
    const loadPostsButton = document.getElementById('btnLoadPosts');
    loadPostsButton.addEventListener('click', loadPosts);
    const urlPosts = 'http://localhost:3030/jsonstore/blog/posts';
    const urlComments = 'http://localhost:3030/jsonstore/blog/comments';

    function loadPosts(){
        document.getElementById('posts').innerHTML = '';
        fetch(urlPosts).then(res => res.json())
        .then(data => {
            for(let post of Object.entries(data)){
                let id = post[1].id;
                let title = post[1].title;

                document.getElementById('posts').appendChild(makeOption(id, title));
            }
        });
    }

    const viewPostButton = document.getElementById('btnViewPost');
    viewPostButton.addEventListener('click', viewPost);

    function viewPost(){
        document.getElementById('post-comments').innerHTML = '';
        const postTitle = document.getElementById('posts')
            .options[document.getElementById('posts')
                .selectedIndex].text;
        document.getElementById('post-title').textContent = postTitle;
        const postId = document.getElementById('posts').value;

        findPostText(postId).then( body => {
            document.getElementById('post-body').textContent = body;
        });

        fetch(urlComments).then(res => res.json())
        .then(data => {
            for(let comment of Object.entries(data)){
                if(comment[1].postId === postId){
                    const liComment = document.createElement('li');
                    liComment.id = comment[1].id;
                    liComment.textContent = comment[1].text;

                    document.getElementById('post-comments').appendChild(liComment);
                }
            }
        });
    }

    function makeOption(id, title){
        let option = document.createElement('option');
        option.value = id;
        option.textContent = title;
        return option;
    }
    async function findPostText(id){
        return fetch(urlPosts).then(res => res.json())
        .then(data => {
            let post = Object.entries(data).find(p => p[1].id === id);
            return post[1].body;
        });
    }
}

attachEvents();