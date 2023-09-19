function DoneTask(value){
    fetch('/tasks/' + value, {
        method: "PATCH"
    }).then(r => {
        console.log(r)
        r.json.then(res => {
            console.log(res)
        })
    })
}