<css 폰트 설정방법> 
===

방법 1.

```
//index.html

<head>

  <link href="https://fonts.googleapis.com/css?family=Nanum+Gothic" rel="stylesheet">

</head>

//<head>에는 링크를 복붙하고


//styles.css
<h2>

font-family: 'Sansita Swashed', cursive;

</h2>

css에서는 이거를 해주면 됨.

```
----
방법 2.

```
//index.html

<head>

     <style>

      @import url('https://fonts.googleapis.com/css2family=Sansita+Swashed:wght@500&display=swap');

      p{

        color: #66BFBF;

        line-height: 2;

        font-size: 3.25em;

        font-family: 'Sansita Swashed', cursive;

      }

    </style>

</head>

<body>

  <p> hihi~ i'm developer. </p>

</body>
```

- - -
<div, span 등 차이점>
===
   
* 문자 일부분만을 선택해서 지정(inline) -> span,b,img

+ 넓은 범위를 묶어서 지정(block)-> p,div,ol,ul,table
