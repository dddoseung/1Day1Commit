/*All about drum class Buttons active event*/

for (var i = 0; i < document.getElementsByClassName("drum").length; i++) {
  //querySelectorAll(".drum").length -> .drum은 class이름을 가리킴

  //click BUtton
  document.getElementsByClassName("drum")[i].addEventListener("click", function(){
    var target = this.innerText; // what is this button's innertext?
    responseToAct(target);
    activeButton(target);
  });

 // Press Keyboard
  document.getElementsByClassName("drum")[i].addEventListener("keypress", function(event){ // function(event) 필수!
    var key_target = event.key; // what is key pressed?
    responseToAct(key_target);
    activeButton(key_target);
  });

   function responseToAct(s){

    switch (s) {
      case "w":
        var audio = new Audio('sounds/crash.mp3');
        audio.play();
        break;
      case "a":
        var audio = new Audio('sounds/kick-bass.mp3');
        audio.play();
        break;
      case "s":
        var audio = new Audio('sounds/snare.mp3');
        audio.play();
        break;
      case "d":
        var audio = new Audio('sounds/tom-1.mp3');
        audio.play();
        break;
      case "j":
        var audio = new Audio('sounds/tom-2.mp3');
        audio.play();
        break;
      case "k":
        var audio = new Audio('sounds/tom-3.mp3');
        audio.play();
        break;
      case "l":
        var audio = new Audio('sounds/tom-4.mp3');
        audio.play();
        break;
      // default:

    }


  }
  function activeButton(value){
    var input=document.querySelector("."+value);
    input.classList.add("pressed"); // css 적용

    setTimeout(function() { // Code here
      input.classList.remove("pressed");
      }, 100);
  }
}
