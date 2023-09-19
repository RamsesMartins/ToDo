function DoneTask(value){
    fetch('/tasks/' + value, {
        method: "PATCH"
    }).then(r => {
        console.log(r)
        location.reload()
        r.json.then(res => {
            console.log(res)
            
        })
    })
}