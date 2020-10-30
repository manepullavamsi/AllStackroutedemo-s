function addData(event)
{
    event.preventDefault();
    alert("hai");
    var name=document.getElementById("name").value;
    var model=document.getElementById("model").value;
    var cost=document.getElementById("cost").value;
    var sailed=document.getElementById("sailed").value;
    var stock=document.getElementById("stock").value;
    alert("values");
    //tese are references of table.
    var tbody=document.getElementById("tbody1");
    //creating elements to table
    var trow=document.createElement("tr");
    var thead=document.createElement("th");
    var td1=document.createElement("td");
    var td2=document.createElement("td");
    var td3=document.createElement("td");
    var td4=document.createElement("td");
    alert("elements");
    //setting data
    var theaddata=document.createTextNode(name);
    thead.appendChild(theaddata);
    var tdata1=document.createTextNode(model);
    td1.appendChild(tdata1);
    var tdata2=document.createTextNode(cost);
    td2.appendChild(tdata2);
    var tdata3=document.createTextNode(sailed);
    td3.appendChild(tdata3);
    var tdata4=document.createTextNode(stock);
    td4.appendChild(tdata4);
    alert("data");
    //appending to row
    trow.appendChild(thead);
    trow.appendChild(td1);
    trow.appendChild(td2);
    trow.appendChild(td3);
    trow.appendChild(td4);
    alert("rows");
    //appending entire row to our table body
    tbody.appendChild(trow);
    alert("complete");
}