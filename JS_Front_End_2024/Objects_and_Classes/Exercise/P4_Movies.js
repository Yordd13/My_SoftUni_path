function solve(input){
    const movies = [];
    for (let inputElement of input) {
        if (inputElement.includes('addMovie')) {
            const movieName = inputElement.toString().split('addMovie ');
            const movie = {
                name: movieName[1],
            }
            movies.push(movie);
        } else if (inputElement.includes('directedBy')) {
            const directorName = inputElement.toString().split(' directedBy ');
            const movie = movies.find(movie => movie.name === directorName[0]);
            if (movie) {
                movie.director = directorName[1];
            }
        } else if (inputElement.includes('onDate')) {
            const movieDate = inputElement.toString().split(' onDate ');
            const movie = movies.find(movie => movie.name === movieDate[0]);
            if (movie) {
                movie.date = movieDate[1];
            }
        }
    }
    for (let movie of movies) {
        if (movie.director && movie.date) {
            console.log(JSON.stringify(movie));
        }
    }
}

solve([
    'addMovie Fast and Furious',
    'addMovie Godfather',
    'Inception directedBy Christopher Nolan',
    'Godfather directedBy Francis Ford Coppola',
    'Godfather onDate 29.07.2018',
    'Fast and Furious onDate 30.07.2018',
    'Batman onDate 01.08.2018',
    'Fast and Furious directedBy Rob Cohen'
    ]);