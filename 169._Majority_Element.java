/*
@media screen and (min-width: 321px) and (max-width: 360px) {
  .nav-header {
    height: 60px;
  }

  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    font-family: "Montserrat", sans-serif;
    height: 0;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    text-align: center;
    top: 50px;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    padding-right: 80px;
    width: 100%;
  }

  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 90px);
    overflow-y: auto;
  }

  footer {
    margin-top: 10px;
  }

  footer,
  main::after {
    bottom: 0;
    height: 42px;
  }

  footer span {
    margin-left: 80px;
  }

  footer .footer-links {
    font-size: 10px;
    text-align: center;
    float: none;
  }
}

@media screen and (min-width: 361px) and (max-width: 375px) {
  .nav-header {
    height: 60px;
  }

  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    font-family: "Montserrat", sans-serif;
    height: 0;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    top: 50px;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    padding-right: 80px;
    width: 100%;
  }

  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 120px);
    overflow-y: auto;
  }

  footer,
  main::after {
    bottom: 0;
    height: 43px;
  }

  footer span {
    margin-left: 95px;
  }

  footer {
    margin-top: 10px;
  }

  footer .footer-links {
    font-size: 14px;
    margin-left: 5%;
    float: none;
    padding-right: 0;
  }
}

@media screen and (min-width: 376px) and (max-width: 411px) {
  .nav-header {
    height: 60px;
  }

  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    font-family: "Montserrat", sans-serif;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    top: 50px;
    text-align: center;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    padding-right: 80px;
    width: 100%;
  }

  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 130px);
    overflow-y: auto;
  }

  footer {
    margin-top: 10px;
  }

  footer,
  main::after {
    bottom: 0;
    height: 60px;
  }

  footer span {
    font-size: 13px;
    margin-left: 100px;
  }

  footer .footer-links {
    font-size: 24px;
    margin-left: 20px;
    float: none;
    padding-right: 0;
  }
}

@media screen and (min-width: 412px) and (max-width: 414px) {
  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label:hover,
  #nav-check:checked~.nav-btn>label {
    background-color: rgb(121, 62, 62);
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    height: 0;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    top: 50px;
    text-align: center;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    padding-right: 80px;
    width: 100%;
  }

  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 150px);
    overflow-y: auto;
  }

  footer {
    margin-top: 10px;
  }

  footer,
  main::after {
    bottom: 0;
    height: 60px;
  }

  footer span {
    font-size: 13px;
    margin-left: 108px;
  }

  footer .footer-links {
    font-size: 28px;
    margin-left: 15px;
    float: none;
    padding-right: 0;
  }
}

@media screen and (min-width: 415px) and (max-width: 767px) {
  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    font-family: "Montserrat", sans-serif;
    height: 0;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    top: 50px;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    padding-right: 80px;
    width: 100%;
  }

  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 290px);
    overflow-y: auto;
  }

  footer,
  main::after {
    bottom: 0;
    height: 40px;
  }

  footer {
    margin-top: 445px;
  }

  footer span {
    font-size: 12px;
    margin-left: 27%;
  }

  footer .footer-links {
    float: none;
    padding-right: 0;
    text-align: center;
  }
}

@media screen and (min-width: 768px) and (max-width: 1024px) {
  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    font-family: "Montserrat", sans-serif;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    text-align: center;
    top: 50px;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    margin-left: 0;
    margin-right: 0;
    width: 100%;
    padding-right: 80px;
  }

  .nav-links>ul>li>a {
    color: #efefef;
    display: inline-block;
    padding-top: 0;
    text-align: center;
    text-decoration: none;
  }



  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 290px);
    overflow-y: auto;
  }

  footer {
    margin-top: 626px;
  }

  footer,
  main::after {
    bottom: 0;
    height: 40px;
  }

  footer span {
    font-size: 18px;
    margin-left: 10px;
  }

  footer span.links {
    font-size: 24px;
    margin-left: -80px;
    text-align: center;
  }
}

/* media queries for destinations places */

@media screen and (min-width: 0) and (max-width: 320px) {
  .nav-btn {
    display: inline-block;
    position: absolute;
    right: 0;
    top: 0;
  }

  .nav-btn>label {
    display: inline-block;
    height: 50px;
    padding: 13px;
    width: 50px;
  }

  .nav-btn>label>span {
    border-top: 2px solid #eee;
    display: block;
    height: 10px;
    width: 25px;
  }

  .nav-links {
    background-color: rgb(121, 62, 62);
    display: block;
    font-family: "Montserrat", sans-serif;
    height: 0;
    left: 0;
    overflow-y: hidden;
    position: absolute;
    top: 50px;
    transition: all 0.3s ease-in;
    width: 100%;
  }

  .nav-links>ul>li {
    display: block;
    padding-right: 80px;
    width: 100%;
  }

  #nav-check:not(:checked)~.nav-links {
    height: 0;
  }

  #nav-check:checked~.nav-links {
    height: calc(50vh - 70px);
    overflow-y: auto;
  }

  footer {
    margin-top: 10px;
  }

  footer,
  main::after {
    bottom: 0;
    height: 45px;
  }

  footer span {
    font-size: 11px;
    margin-left: 60px;
  }

  footer .footer-links {
    font-size: 10px;
    float: none;
    padding-right: 0;
  }
}

/* media queries for each destination place */

@media screen and (min-width: 378px) and (max-width: 411px) {

  iframe {
    border: 2px solid white;
    height: 200px;
    margin-left: 15px;
    margin-top: 20px;
    width: 375px;
  }

  .city-description {
    margin: 10px;
    width: 380px;
  }

  .city-main footer {
    margin-top: 85px;
  }
}

/* media queries for tour packages */

@media screen and (min-width: 0) and (max-width: 414px) {
  .package-main table {
    display: block;
    margin-bottom: 10px;
    margin-left: 10px;
    margin-right: 10px;
    margin-top: 10px;
    max-width: 94%;
    overflow-x: auto;
    width: fit-content;
  }

  .package-main .head {
    margin-left: 10px;
  }

  .package-main .tag {
    margin-right: 10px;
    margin-top: -10px;
  }
}

/* media queries offers */

/* media queries enquire us page */

/* media queries contact us */

@media screen and (min-width: 321px) and (max-width: 360px) and (min-height: 640px) {
  .contact-section {
    margin-left: 10px;
    margin-right: 10px;
    margin-top: 0;
  }

  .contact-footer {
    margin-top: 70px;
  }
}

@media screen and (min-width: 361px) and (max-width: 375px) and (max-height: 667px) {
  .terms-section {
    margin-left: 20px;
    margin-right: 20px;
    margin-top: 0;
  }

  .terms-footer {
    margin-top: -8px;
  }
}

@media screen and (max-height: 731px) and (max-width: 411px) and (min-width: 376px) {
  .contact-section {
    margin-left: 10px;
    margin-right: 10px;
    margin-top: 0;
  }

  .contact-footer {
    margin-top: 170px;
  }
}

/* About us responsive  */

/* media queries terms and conditions   */

@media screen and (min-width: 361px) and (max-width: 375px) and (min-height: 668px) and (max-height: 812px) {
  .terms-section {
    margin-left: 20px;
    margin-right: 20px;
    margin-top: 0;
  }

  .terms-footer {
    margin-top: 158px;
  }
}

@media screen and (min-width: 376px) and (max-width: 411px) and (max-height: 731px) {
  .terms-section {
    margin-left: 20px;
    margin-right: 20px;
    margin-top: 0;
  }

  .terms-footer {
    margin-top: 120px;
  }
}

/* home code responsive */
@media screen and (max-width: 940px) {
  .slideshow {
    height: 20%;
    margin: 0 auto;
    overflow: hidden;
    padding-top: 10px;
    width: 80%;
  }

  .slide {
    float: left;
    height: 450px;
    width: 740px;
  }

  .slide-wrapper {
    animation: slide2 18s ease infinite;
    width: 5640px;
  }
}

/* Media Queries for Cards */

@media screen and (min-width: 0) and (max-width: 320px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 10px;
    font-size: 30px;
  }

  .description {
    font-size: 17px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 190px;
    width: 260px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide8 18s ease infinite;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
    border: 0;

  }

  .cardHolder {
    margin-left: 20px;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }


  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 10px;
    margin-right: 10px;
  }

  .box {
    width: 260px;
    height: 180px;
  }

  .box img {
    width: 260px;
    height: 180px;
  }

  .box .text {
    height: 180px;
  }
}

@media screen and (min-width: 321px) and (max-width: 360px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 20px;
    font-size: 32px;
  }

  .description {
    font-size: 18px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 200px;
    width: 290px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide7 18s ease infinite;
  }

  .box {
    position: relative;
    display: inline-block;
    width: 290px;
    height: 200px;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
    border: 0;
  }

  .cardHolder {
    margin-left: 0;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }



  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 35px;
    margin-right: 10px;
  }



  .box img {
    width: 290px;
    height: 200px;
  }

  .box .text {
    height: 200px;
  }
}

@media screen and (min-width: 361px) and (max-width: 375px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 20px;
    font-size: 32px;
  }

  .description {
    font-size: 18px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 220px;
    width: 300px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide6 18s ease infinite;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
    border: 0;
  }

  .cardHolder {
    margin-left: 27px;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }



  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 10px;
    margin-right: 10px;
  }

  .box {
    width: 300px;
    height: 200px;
  }

  .box img {
    width: 300px;
    height: 200px;
  }

  .box .text {
    height: 200px;
  }
}

@media screen and (min-width: 376px) and (max-width: 411px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 20px;
    font-size: 32px;
  }

  .description {
    font-size: 18px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 240px;
    width: 340px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide5 18s ease infinite;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
  }

  .cardHolder {
    margin-left: 30px;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }



  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 10px;
    margin-right: 10px;
  }

  .box {
    width: 330px;
    height: 200px;
  }

  .box img {
    width: 330px;
    height: 200px;
  }

  .box .text {
    height: 200px;
  }
}

@media screen and (min-width: 412px) and (max-width: 414px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 20px;
    font-size: 32px;
  }

  .description {
    font-size: 18px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 240px;
    width: 340px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide5 18s ease infinite;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
    border: 0;
  }

  .cardHolder {
    margin-left: 30px;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }


  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 11px;

    /* margin-right: 10px; */
  }

  .box {
    height: 200px;
    width: 330px;
  }

  .box img {
    height: 200px;
    width: 100%;
  }

  .box .text {
    height: 200px;
  }
}

@media screen and (min-width: 415px) and (max-width: 768px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 50px;
    font-size: 40px;
  }

  .description {
    font-size: 28px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 450px;
    width: 620px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide3 18s ease infinite;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
    border: 0;
  }

  .cardHolder {
    margin-left: 65px;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }


  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 10px;
    margin-right: 10px;
  }

  .box {
    width: 615px;
  }

  .box img {
    width: 615px;
  }
}

@media screen and (min-width: 769px) and (max-width: 1024px) {

  html,
  body {
    overflow-x: hidden;
  }

  td h2 {
    padding-top: 50px;
    font-size: 50px;
  }

  .description {
    font-size: 32px;
  }

  .slideshow {
    padding-top: 10px;
    overflow: hidden;
    height: 20%;
    width: 80%;
    margin: 0 auto;
  }

  .slide {
    float: left;
    height: 450px;
    width: 820px;
  }

  .slide-wrapper {
    width: 5640px;
    animation: slide1 18s ease infinite;
  }

  table {
    border-collapse: collapse;
    margin: 0;
    padding: 0;
    width: 100%;
    table-layout: fixed;
    border: 0;
  }

  .cardHolder {
    margin-left: 105px;
    margin-right: 0;
    margin-top: 30px;
    margin-bottom: 0;
  }



  table tr {
    display: block;
  }

  table td {
    display: block;
    margin-top: 6px;
    margin-left: 0;
    margin-right: 0;
  }

  .box {
    width: 820px;
  }

  .box img {
    width: 820px;
  }

  .box .text {
    width: 820px;
  }
}

/* gallery responsive code */

@media screen and (min-width: 769px) and (max-width: 1024px) {
  .gallery-footer {
    margin-top: 10px;
  }

  html,
  body {
    overflow-x: hidden;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-head {
    margin-left: 50px;
  }

  .gallery-video {
    margin-left: 300px;
    margin-top: -18px;
    color: rgb(121, 62, 62);
    font-family: "Montserrat", sans-serif;
    font-weight: 600;
    font-size: 16px;
  }

  .gallery-row {
    margin-left: 30px;
    margin-right: 30px;
  }

  .gallery-column {
    flex: 50%;
    max-width: 50%;
    padding-bottom: 0;
  }

  .col1 {
    display: flex;
    flex-direction: row;
    margin-left: -10px;
    padding-top: 0;
  }

  .img1 {
    max-width: 100%;
    margin-left: 10px;
  }

  .img2 {
    margin-left: 20px;
  }

  hr {
    width: 94%;
    margin-left: 30px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 30px;
    margin-right: 30px;
  }
}

@media screen and (min-width: 415px) and (max-width: 768px) {
  .gallery-video {
    margin-left: 200px;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-head {
    margin-left: 50px;
  }

  .gallery-row {
    margin-left: 30px;
    margin-right: 30px;
  }

  .gallery-column {
    max-width: 50%;
    padding-bottom: 0;
  }

  .col1 {
    display: flex;
    flex-direction: row;
    margin-left: -10px;
    padding-top: 0;
  }

  .img1 {
    max-width: 100%;
    margin-left: 10px;
  }

  .img2 {
    margin-left: 20px;
  }

  .main-gallery hr {
    width: 94%;
    margin-left: 30px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 30px;
    margin-right: 30px;
  }

  .item3 {
    height: 290px;
  }
}

@media screen and (min-width: 361px) and (max-width: 375px) {
  .gallery-footer {
    margin-top: 0;
  }

  html,
  body {
    overflow-x: hidden;
  }

  .gallery-video {
    margin-top: -18px;
    color: rgb(121, 62, 62);
    font-family: "Montserrat", sans-serif;
    font-weight: 600;
    font-size: 16px;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-head {
    margin-left: 50px;
  }

  .gallery-row {
    margin-left: 30px;
    margin-right: 30px;
  }

  .gallery-column {
    flex: 100%;
    max-width: 100%;
    padding-bottom: 0;
    padding-top: 0;
  }

  .main-gallery hr {
    width: 85%;
    margin-left: 30px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 30px;
    margin-right: 30px;
    display: block;
  }

  .item2,
  .item3,
  .item4,
  .item5 {
    height: 250px;
    margin-top: 20px;
  }
}

@media screen and (min-width: 412px) and (max-width: 414px) {

  html,
  body {
    overflow-x: hidden;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-head {
    margin-left: 50px;
  }

  .gallery-video {
    margin-left: 200px;
  }

  .gallery-row {
    margin-left: 30px;
    margin-right: 30px;
  }

  .gallery-column {
    flex: 100%;
    max-width: 100%;
    padding-bottom: 0;
    padding-top: 0;
  }

  .main-gallery hr {
    width: 86%;
    margin-left: 30px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 30px;
    margin-right: 30px;
    display: block;
  }

  .item2,
  .item3,
  .item4,
  .item5 {
    height: 250px;
    margin-top: 20px;
  }
}

@media screen and (min-width: 0) and (max-width: 320px) {

  html,
  body {
    overflow-x: hidden;
  }

  .gallery-video {
    margin-left: 150px;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-head {
    margin-left: 20px;
  }

  .gallery-row {
    margin-left: 20px;
    margin-right: 20px;
  }

  .gallery-column {
    flex: 100%;
    max-width: 100%;
    padding-bottom: 0;
    padding-top: 0;
  }

  .main-gallery hr {
    width: 87%;
    margin-left: 20px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 25px;
    margin-right: 25px;
    display: block;
  }

  .item2,
  .item3,
  .item4,
  .item5 {
    height: 250px;
    margin-top: 20px;
  }
}

@media screen and (min-width: 376px) and (max-width: 411px) {
  .gallery-video {
    margin-left: 200px;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-head {
    margin-left: 40px;
  }

  .gallery-row {
    margin-left: 20px;
    margin-right: 20px;
  }

  .gallery-column {
    max-width: 100%;
    padding-bottom: 0;
    padding-top: 0;
  }

  .main-gallery hr {
    width: 89%;
    margin-left: 20px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 25px;
    margin-right: 25px;
    display: block;
  }

  .item2,
  .item3,
  .item4,
  .item5 {
    height: 250px;
    margin-top: 20px;
  }
}

@media screen and (min-width: 321px) and (max-width: 360px) {

  html,
  body {
    overflow-x: hidden;
  }

  .main-gallery {
    margin-top: 80px;
  }

  .gallery-video {
    margin-left: 200px;
  }

  .gallery-head {
    margin-left: 40px;
  }

  .gallery-row {
    margin-left: 20px;
    margin-right: 20px;
  }

  .gallery-column {
    flex: 100%;
    max-width: 100%;
    padding-bottom: 0;
    padding-top: 0;
  }

  .main-gallery hr {
    width: 89%;
    margin-left: 20px;
    margin-top: 40px;
  }

  .grid-container {
    margin-left: 25px;
    margin-right: 25px;
    display: block;
  }

  .item2,
  .item3,
  .item4,
  .item5 {
    height: 250px;
    margin-top: 20px;
  }
}

/* style.css responsive */
*/
class Solution {
  //Brute force logic, I will try to do in a better way.
    public int majorityElement(int[] nums) {
        int m=0,i=0;
        for(int j=0;j<nums.length;j++){
            while(i<nums.length){
                if(nums[j]==nums[i]){
                    m++;
                }
                i++;
                if(m>=(nums.length-m)){
                i=nums[j];
                break;
                }
            }
            m=0;
            i=0;
        }
        return i;
      /*
      It is better than above logic.
      int m=0,res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    m++;
                }
            }
            if(m>=(nums.length-m)){
                res=nums[i];
                break;
            }
            m=0;
        }
        return res;
      */
    }
}
