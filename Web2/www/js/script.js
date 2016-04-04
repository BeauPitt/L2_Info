// alert("test");

// recup les elems du form
var nom = document.getElementById("lastname"); // pas etre vide
var pnom = document.getElementById("firsname"); // pas etre vide
var mail = document.getElementById("useremail"); // regExp
var mdp = document.getElementById("usrpwd"); // regExp
var pseudo = document.getElementById("usrname"); // length
var datnais = document.getElementById("birthdate"); // typeDate ( = true)

// regExp
var regEmail = new RegExp(/^[a-z0-9._-]+@[a-z0-9._-]+\.[a-z]{2,6}$/);

function checkForm() { 
    // l'input est réactivé si tous les elements sont validés
    
}

useremail.addEventListener("click", function() {
    if (mail.value == regEmail) {
        alert(nom.value);
    }
    else {
        alert('lol')
    }
});