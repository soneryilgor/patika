let myNodeList = document.getElementsByTagName("li")
for (let i = 0; i < myNodeList.length; i++) {
    let span = document.createElement("span");
    let txt = document.createTextNode("\u00D7");
    span.className = "close";
    span.appendChild(txt);
    myNodeList[i].appendChild(span);
}

let close = document.getElementsByClassName("close");

for (let i = 0; i < close.length; i++) {
    close[i].onclick = function() {
        let div = this.parentElement;
        div.style.display = "none";
    }
}

let list = document.querySelector("ul") 
list.addEventListener("click",function(event){
    if ( event.target.tagName === "LI") {
        event.target.classList.toggle("checked");
 
    }
},false );
function newElement() {
    let liDOM = document.createElement("li");
    let inputValue = document.getElementById("task").value;
    let x = document.createTextNode(inputValue);
    liDOM.appendChild(x);
    
    
    if ( inputValue.trim() == "" ) {
        $('.error.toast').toast("show")
        
    } else {
        let task = document.querySelector("#task")
        document.getElementById("list").appendChild(liDOM);
        $('.success').toast("show")
    }
    document.getElementById("task").value = "";
    
    let span = document.createElement("SPAN");
    let txt = document.createTextNode("\u00D7");
    span.className = "close";
    span.appendChild(txt);
    liDOM.appendChild(span);

    for (let i = 0; i < close.length; i++) {
        close[i].onclick = function() {
            let div = this.parentElement;
            div.style.display = "none";
        }
    }
  
}