<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>즐거운 자기소개</title>
        <link rel="icon" type="image/x-icon" href="assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v5.13.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="css/styles.css" rel="stylesheet" />
    </head>
    <body id="page-top">
        <!-- Navigation-->
 		<nav class="navbar navbar-expand-lg navbar-dark fixed-top" id="mainNav">
            <div class="container">
                <a class="navbar-brand js-scroll-trigger" href="#page-top"></a>
                <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">Menu<i class="fas fa-bars ml-1"></i></button>
                <div class="collapse navbar-collapse" id="navbarResponsive">
                    <ul class="navbar-nav text-uppercase ml-auto">
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#introduce">자기소개</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#portfolio">배운 것들</a></li>
                        <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#about">목표</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- Masthead-->
        <header class="masthead">
            <div class="container">
                <div class="masthead-subheading">DB는 재밌지만 오라클은 싫은</div>
                <div class="masthead-heading">김태웅</div>
                <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="#introduce">Tell Me More</a>
            </div>
        </header>
        <!-- Services-->
        <section class="page-section" id="introduce">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">introduce</h2>
                    <h3 class="section-subheading text-muted">좋은 개발자는 죽은 개발자이다 - Vill Gates</h3>
                </div>
                <div class="row text-center">
                    <div class="col-md-4">
                        <span class="fa-stack fa-4x"><i class="fas fa-circle fa-stack-2x text-primary"></i>
                        <i class="fas fa-search-dollar fa-stack-1x fa-inverse"></i></span>
                        <h4 class="my-3">(전)마케터</h4>
                        <p class="text-muted">블로그 마케팅 플랫폼 회사에서 개발팀에 소속되어 운영 및 데이터 분석업무를 수행</p>
                    </div>
                    <div class="col-md-4">
                        <span class="fa-stack fa-4x"><i class="fas fa-circle fa-stack-2x text-primary"></i>
                        <i class="fas fa-laptop-code fa-stack-1x fa-inverse"></i></span>
                        <h4 class="my-3">(현)학생</h4>
                        <p class="text-muted">개발 변태가 되고 싶은 욕망이 가득한 학생</p>
                    </div>
                    <div class="col-md-4">
                        <span class="fa-stack fa-4x"><i class="fas fa-circle fa-stack-2x text-primary"></i>
                        <i class="fas fa-database fa-stack-1x fa-inverse"></i></span>
                        <h4 class="my-3">(언젠간)DBA!</h4>
                        <p class="text-muted">쿼리만 짜면서 돈벌고 싶은 욕망이 가득</p>
                    </div>
                </div>
            </div>
        </section>
        <!-- Portfolio Grid-->
        <section class="page-section bg-light" id="portfolio">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">배운 것들</h2>
                    <h3 class="section-subheading text-muted">배움엔 끝이 없고, 버그도 끝이 없다 - Tim Cooc</h3>
                </div>
                <div class="row">
                    <div class="col-lg-4 col-sm-6 mb-4">
                        <div class="portfolio-item">
                            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal1"
                                ><div class="portfolio-hover">
                                    <div class="portfolio-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                </div>
                                <img class="img-fluid" src="assets/img/lang/java.jpg" alt=""
                            /></a>
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">JAVA</div>
                                <div class="portfolio-caption-subheading text-muted">"자바 2분이요!"</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4">
                        <div class="portfolio-item">
                            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal2"
                                ><div class="portfolio-hover">
                                    <div class="portfolio-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                </div>
                                <img class="img-fluid" src="assets/img/lang/html.jpg" alt=""
                            /></a>
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">HTML</div>
                                <div class="portfolio-caption-subheading text-muted">나모웹에디터로 배워요</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4">
                        <div class="portfolio-item">
                            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal3"
                                ><div class="portfolio-hover">
                                    <div class="portfolio-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                </div>
                                <img class="img-fluid" src="assets/img/lang/css.jpg" alt=""
                            /></a>
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">CSS</div>
                                <div class="portfolio-caption-subheading text-muted">576,768,992,1200</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4 mb-lg-0">
                        <div class="portfolio-item">
                            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal4"
                                ><div class="portfolio-hover">
                                    <div class="portfolio-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                </div>
                                <img class="img-fluid" src="assets/img/lang/jquery.jpg" alt=""
                            /></a>
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">JQUERY</div>
                                <div class="portfolio-caption-subheading text-muted">$(this)</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6 mb-4 mb-sm-0">
                        <div class="portfolio-item">
                            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal5"
                                ><div class="portfolio-hover">
                                    <div class="portfolio-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                </div>
                                <img class="img-fluid" src="assets/img/lang/js.jpg" alt=""
                            /></a>
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">JAVASCRIPT</div>
                                <div class="portfolio-caption-subheading text-muted">자바랑 다른거에요?</div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-4 col-sm-6">
                        <div class="portfolio-item">
                            <a class="portfolio-link" data-toggle="modal" href="#portfolioModal6"
                                ><div class="portfolio-hover">
                                    <div class="portfolio-hover-content"><i class="fas fa-plus fa-3x"></i></div>
                                </div>
                                <img class="img-fluid" src="assets/img/lang/jsp.jpg" alt=""
                            /></a>
                            <div class="portfolio-caption">
                                <div class="portfolio-caption-heading">JSP</div>
                                <div class="portfolio-caption-subheading text-muted"><% %></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- About-->
        <section class="page-section" id="about">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">목표</h2>
                    <h3 class="section-subheading text-muted">1년, 3년, 5년, 10년 후.</h3>
                </div>
                <ul class="timeline">
                    <li>
                        <div class="timeline-image"><img class="rounded-circle img-fluid" src="assets/kdata_logo.png" alt="" /></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4>1년 후</h4>
                                <h4 class="subheading">DAsP,SQLD, ADsP</h4>
                            </div>
                            <div class="timeline-body"><p class="text-muted">취업도 했겠고.. 데이터베이스 관련 자격증들을 따놓을 예정.</p></div>
                        </div>
                    </li>
                    <li class="timeline-inverted">
                        <div class="timeline-image"><img class="rounded-circle img-fluid" src="assets/kdata_logo.png" alt="" /></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4>3년 후</h4>
                                <h4 class="subheading">DAP, SQLP, ADP<br>& 서비스 출시</h4>
                            </div>
                            <div class="timeline-body"><p class="text-muted">내 스스로 만든 서비스 하나 출시하기</p></div>
                        </div>
                    </li>
                    <li>
                        <div class="timeline-image"><img class="rounded-circle img-fluid" src="assets/img/about/3.jpg" alt="" /></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4>5년 후</h4>
                                <h4 class="subheading">소상공인을 위한<br>무료광고플랫폼 개발</h4>
                            </div>
                            <div class="timeline-body"><p class="text-muted">이걸 위해서 돈을 벌어야하네..</p></div>
                        </div>
                    </li>
                    <li class="timeline-inverted">
                        <div class="timeline-image">
                            <h4>10년 후<br /><br />풀스택 개발자?</h4>
                        </div>
                    </li>
                </ul>
            </div>
        </section>
        
        <!-- Contact-->
        <section class="page-section" id="contact">
            <div class="container">
                <div class="text-center">
                    <h2 class="section-heading text-uppercase">Contact Me</h2>
                    <h3 class="section-subheading text-muted">후원 계좌 : 우리은행 1002-345-296370 김태웅</h3>
                </div>
                <form id="contactForm" name="sentMessage" novalidate="novalidate">
                    <div class="row align-items-stretch mb-5">
                        <div class="col-md-6">
                            <div class="form-group">
                                <input class="form-control" id="name" type="text" placeholder="이름을 입력하세요 *" required="required" data-validation-required-message="이름을 입력해주세요" />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="form-group">
                                <input class="form-control" id="email" type="email" placeholder="이메일 주소를 입력하세요 *" required="required" data-validation-required-message="이메일 주소를 입력해주세요" />
                                <p class="help-block text-danger"></p>
                            </div>
                            <div class="form-group mb-md-0">
                                <input class="form-control" id="phone" type="tel" placeholder="연락처를 입력해주세요 *" required="required" data-validation-required-message="연락처를 입력해주세요" />
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="form-group form-group-textarea mb-md-0">
                                <textarea class="form-control" id="message" placeholder="하고 싶은 말은? *" required="required" data-validation-required-message="하고 싶은 말을 적어주세요"></textarea>
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                    </div>
                    <div class="text-center">
                        <div id="success"></div>
                        <button class="btn btn-primary btn-xl text-uppercase" id="sendMessageButton" type="submit">입력 완료</button>
                    </div>
                </form>
            </div>
        </section>
        <!-- Footer-->
        <footer class="footer py-4">
            <div class="container">
                <div class="row align-items-center">
                    <div class="col-lg-4 text-lg-left">Copyright © Your Website 2020</div>
                    <div class="col-lg-4 my-3 my-lg-0">
                        <a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-twitter"></i></a><a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-facebook-f"></i></a><a class="btn btn-dark btn-social mx-2" href="#!"><i class="fab fa-linkedin-in"></i></a>
                    </div>
                    <div class="col-lg-4 text-lg-right"><a class="mr-3" href="#!">Privacy Policy</a><a href="#!">Terms of Use</a></div>
                </div>
            </div>
        </footer>
        <!-- Portfolio Modals--><!-- Modal 1-->
        <div class="portfolio-modal modal fade" id="portfolioModal1" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">자바</h2>
                                    <p class="item-intro text-muted">오라클꺼</p>
                                    <img class="img-fluid d-block mx-auto" src="assets/img/lang/java.jpg" alt="" />
                                    <p>장점 : 수요가 많다</p>
                                    <p>단점 : 공급이 많다</p>
                                    <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times mr-1"></i>Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal 2-->
        <div class="portfolio-modal modal fade" id="portfolioModal2" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">에이치티엠엘</h2>
                                    <p class="item-intro text-muted">w3c꺼</p>
                                    <img class="img-fluid d-block mx-auto" src="assets/img/lang/html.jpg" alt="" />
                                    <p>"프로그램 언어 중에 java가 좋아요? html이 좋아요?<br>라고 개발자에게 물어보자.</p>
                                    <p>화를 내지 않는다면 진짜 개발자인지 의심해보자.<br /> - html은 프로그래밍언어가 아닌 마크업 언어</p>
                                    
                                    <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times mr-1"></i>Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal 3-->
        <div class="portfolio-modal modal fade" id="portfolioModal3" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">씨에스에스</h2>
                                    <p class="item-intro text-muted">w3c꺼</p>
                                    <img class="img-fluid d-block mx-auto" src="assets/img/lang/css.jpg" alt="" />
                                    <p>어? 왜? 어? 응? 아! 엥?</p>
                                    <p>수강생 친구들의 멘탈을 파괴하기 위해 만들어졌다.</p>
                                    <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times mr-1"></i>Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal 4-->
        <div class="portfolio-modal modal fade" id="portfolioModal4" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">제이쿼리</h2>
                                    <p class="item-intro text-muted">존 레식꺼</p>
                                    <img class="img-fluid d-block mx-auto" src="assets/img/lang/jquery.jpg" alt="" />
                                    <p>개발자가 돈을 매우 좋아했나보다. $$$$$$ 지옥</p>
                                    <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times mr-1"></i>Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal 5-->
        <div class="portfolio-modal modal fade" id="portfolioModal5" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">자바스크립트</h2>
                                    <p class="item-intro text-muted">브렌든 아이크꺼</p>
                                    <img class="img-fluid d-block mx-auto" src="assets/img/lang/js.jpg" alt="" />
                                    <p>"저는 자바랑 관계가 없습니다."</p>
                                    <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times mr-1"></i>Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal 6-->
        <div class="portfolio-modal modal fade" id="portfolioModal6" tabindex="-1" role="dialog" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="close-modal" data-dismiss="modal"><img src="assets/img/close-icon.svg" alt="Close modal" /></div>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-8">
                                <div class="modal-body">
                                    <!-- Project Details Go Here-->
                                    <h2 class="text-uppercase">제이에스피</h2>
                                    <p class="item-intro text-muted">오라클꺼</p>
                                    <img class="img-fluid d-block mx-auto" src="assets/img/lang/jsp.jpg" alt="" />
                                    <p> "나도 아직은 현역이라고...." </p>
                                    <button class="btn btn-primary" data-dismiss="modal" type="button"><i class="fas fa-times mr-1"></i>Close</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.bundle.min.js"></script>
        <!-- Third party plugin JS-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
        <!-- Contact form JS-->
        <script src="assets/mail/jqBootstrapValidation.js"></script>
        <script src="assets/mail/contact_me.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </body>
</html>
