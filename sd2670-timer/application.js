var seconds = 0;
var showSeconds = document.getElementById("showSeconds");

function setTimeOnPage(){
	showSeconds.innerText = seconds;
	seconds++;
}

setInterval(setTimeOnPage, 1000);
