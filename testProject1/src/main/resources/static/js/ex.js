/**
 * 순수 자바스크립트 형식 작성해줄 수 있고, jquery 형식도 넣어줄 수 있는 공간
 */

/*
<button id="btn" onclick="버튼클릭()">jquery 연결테스트</button>
를 클랙했을 때 나오는 기능
 */
function 버튼클릭(){
	alert("클릭되었습니다.");
}

/*
<button id="btn">연결 테스트</button>
를 클릭했을 때 나오는 기능
*/
document.querySelector("#btn").addEventListener("click", 버튼클릭);

/*
<button id="btn">연결 테스트</button>
를 제이쿼리 형식으로 변경하기
*/

$(document).ready(function() {
	$("#btn").click(버튼클릭);
})
