var buttonColours = new Array("red", "blue", "green", "yellow");
var gamePattern = new Array();
var userClickedPattern = new Array();

var start=false; // 처음 시작할 때는 false.
var wrongg=false;
var level=0;
// 이건 제일 처음 초기값임. (즉, 처음 시작할 때만 이 값이라는 소리)

  $(document).keypress(function(event){
    if(event.key==='a' || event.key==='A'){ // a키를 눌렀을 때만 반응함
      if(start==false){ // start가 false값일 때만 시작함
        start=true;
        nextSequence();
      }
    }

    else{};

  })

$(".btn").on("click",function(){ // !!!!!! $("button")은 안되는 듯하다 !!!!!!!
  var userChosenColour = $(this).attr("id");
  userClickedPattern.push(userChosenColour);

  playSound(userChosenColour);
  animatePress(userChosenColour);

  checkAnswer(userClickedPattern.length-1);

});

function nextSequence(){
  level++; //nextSequence가 호출될 때마다 level은 올라감

  $("#level-title").text("Level "+level);

  var randomNumber = Math.floor(Math.random() * 4); // 0 ~ 3
  var randomChosenColour = buttonColours[randomNumber];
  gamePattern.push(randomChosenColour);

  playSound(randomChosenColour);
  $("#"+randomChosenColour).fadeIn(100).fadeOut(100).fadeIn(100);

  userClickedPattern = []; // 초기화시켜야 함
}

function playSound(name){
  // the user clicks a button sound
  var audio = new Audio("sounds/"+name+".mp3");
  audio.play();
}


function animatePress(currentColour){
  $("#"+currentColour).addClass("pressed");

  setTimeout(function(){
    // 이벤트 동작에 delay를 주는 것임
      $("#"+currentColour).removeClass("pressed");
      // 즉, pressed 클래스를 삭제하는 것을 1초간 delay 시킴.
  }, 100);

}

function checkAnswer(currentLevel){

    if(userClickedPattern[currentLevel]===gamePattern[currentLevel]){
      //버튼을 틀리지 않았다면
      if(currentLevel===gamePattern.length-1){
        //+끝까지 다 눌렀다면
        setTimeout(function(){
            nextSequence();
        }, 1000);
      }
    }
    else{
      // 버튼을 틀렸다면
      $("h1").text("Game Over, Press Any Key to Restart");

      playSound("wrong"); // 경고음
      $("body").addClass("game-over");

      setTimeout(function(){
        $("body").removeClass("game-over");
      },200);
      wrongg=true;
    }

  if(wrongg===true)
  // 만약 틀렸다면 바로 리셋
    startOver();
}


function startOver(){
  level=0;
  gamePattern=[];
  start=false;
  wrongg=false;
  // 틀리면 모두 초기화 시켜줘야 함
}
