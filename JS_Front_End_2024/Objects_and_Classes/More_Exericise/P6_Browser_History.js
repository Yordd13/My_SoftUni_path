function solve(object, array){

    for(let action of array){
        if(action !== 'Clear History and Cache'){
            let [command, site] = action.split(' ');
            if(command === 'Open'){
                object['Open Tabs'].push(site);
                object['Browser Logs'].push(action);
            } else if(command === 'Close' && object['Open Tabs'].includes(site)){
                object['Open Tabs'].splice(object['Open Tabs'].indexOf(site),1);
                object['Recently Closed'].push(site);
                object['Browser Logs'].push(action);
            }
        }
        else{
            object['Open Tabs'] = [];
            object['Recently Closed'] = [];
            object['Browser Logs'] = [];
        }
    }

    console.log(object['Browser Name']);
    console.log(`Open Tabs: ${object['Open Tabs'].join(', ')}`);
    console.log(`Recently Closed: ${object['Recently Closed'].join(', ')}`);
    console.log(`Browser Logs: ${object['Browser Logs'].join(', ')}`);
}

solve({"Browser Name":"Mozilla Firefox",
    "Open Tabs":["YouTube"],
    "Recently Closed":["Gmail", "Dropbox"],
    "Browser Logs":["Open Gmail", "Close Gmail", "Open Dropbox", "Open YouTube", "Close Dropbox"]},
    ["Open Wikipedia", "Clear History and Cache", "Open Twitter"]
);