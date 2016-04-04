/*
* items.js
*/

var element = document.getElementById("boomerang");
var asideBoo = document.getElementById("span_boomerang");

<<<<<<< HEAD
function clique() {
       asideBoo.style.display = "block";
    };

element.addEventListener("click", clique);
=======
element.onclick = (function() {
        alert("Vous m'avez cliqué !");
});
>>>>>>> origin/master
