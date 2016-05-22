var labelUserName = document.getElementById("username");
var labelPwd = document.getElementById("userpwd");
var labelMessage = document.getElementById("messageConnexion");
var buttonSubmit = document.getElementById("envoi");
var formLogin = document.getElementById("formConnexion");
buttonSubmit.addEventListener("click", sendRequest, false);
labelMessage.innerHTML = "";

function sendRequest(event) {
    event.preventDefault();
    var xhr = new XMLHttpRequest();
    xhr.addEventListener('readystatechange', function() {
        if (xhr.readyState === 2 || xhr.readyState === 3) {
            message("Chargement");
        }
        else if (xhr.readyState === 4 && xhr.status === 200) {
            message(xhr.responseText);
            removeForm();
        }
        else if(xhr.readyState === 4) {
           message("Erreur : " + xhr.responseText);
        }
    });
    xhr.open('POST', "../htbin/login.py");
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
    xhr.send("username=" + encodeURIComponent(labelUserName.value) + "&userpwd=" + encodeURIComponent(labelPwd.value), true);

}

function message(texte) {
    labelMessage.innerHTML = texte;
}

function removeForm() {
    formLogin.parentNode.removeChild(formLogin);

}