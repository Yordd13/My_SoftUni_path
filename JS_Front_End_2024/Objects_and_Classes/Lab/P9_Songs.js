function solve(array){
    let songs = [];
    class Song{
        constructor(typeList,name,time){
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }
    }

    let n = array[0];

    for(let i = 1; i < array.length - 1; i++){
        let [type,name,time] = array[i].split('_');

        songs.push(new Song(type,name,time));
    }

    let filter = array[array.length - 1];
    for(let song of songs){
        if(filter === 'all' || song['typeList'] === filter){
            console.log(song[`name`]);
        }
    }
}

solve([2,
    'like_Replay_3:15',
    'ban_Photoshop_3:48',
    'all']);