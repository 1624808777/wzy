function login() {
 
    var username = document.getElementById("username");
    var pass = document.getElementById("password");
    var vcode = document.getElementById("vcode");
 
    if (username.value == "") {
 
        alert("�������û���");
 
    } else if (pass.value  == "") {
 
        alert("����������");
 
    } else if (vcode.value  == "") {
 
        alert("����������");
    }
    else if(username.value == "admin" && pass.value == "123456"){
 
        window.location.href="login.html";
 
    } else {
 
        alert("��������ȷ���û��������룡")
 
    }
}//�����֤��ͼƬ
function changeImg() {
    //��Ҫ��ÿ�������url�������仯���������������Ϊ���ʵ���ͬһ��ͼƬ���Ͳ���ˢ��������
    document.getElementById("vcodeImg").src = "createVerifyImage.do?t=" + Math.random();
}