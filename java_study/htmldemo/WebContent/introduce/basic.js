windows.onload = function(){
var theBtn=document.getElementById("title");
theBtn.onmouseover=function(){
	// 마우스오버 시 텍스트 및 이미지 변경.
	document.getElementById("title").innerText="김태웅";
};
theBtn.onmouseout=function(){
	// 마우스아웃 시 텍스트 및 이미지 변경.
	document.getElementById("title").innerText="Who am I?";
};
$(function(){
    $('nav a').on('click', function(e) {
        e.preventDefault(); // 링크 기본 동작 취소
        var url = this.href;

        $('nav a.active').removeClass('active'); // 현재 링크 활성화 제거
        $(this).aEddClass('active');

        $('#cotent .container').remove();  // 이 전 페이지 내용 제거
        $('#content').load(url + ' #content').hide().fadeIn('slow'); 
          // 새 페이지에서 #content 부분을 가져와 추가한다.
    });
});
};
