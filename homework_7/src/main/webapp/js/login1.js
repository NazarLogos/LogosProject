
function showAlertAfterRegistration() {
	$('div.alertic').show().hide(4000);
}
function Switch() {
	$(document).ready(function() {
		setTimeout(function() {
			location.reload(true);
		}, 4200);
	});
};
$('.message a').click(function() {
	Switch();
});

$("button.registr-b").click(function() {

	var firstName = $("form.registr-form input.firstName").val();
	var lastName = $("form.registr-form input.lastName").val();
	var email = $("form.registr-form input.email").val();
	var password = $("form.registr-form input.password").val();

	if (firstName == '' || lastName == '' || email == '' || password == '') {
		alert("Please fill all fields...!!!!!!");
	} else if ((password.length) < 8) {
		alert("Password should atleast 8 character in length...!!!!!!");
	} else {
		var userRegistration = {
			firstName : firstName,
			lastName : lastName,
			email : email,
			password : password
		};

		$.post("registration", userRegistration, function(data) {
			if (data == 'Success') {
				$("form")[1].reset();
				showAlertAfterRegistration();
				Switch();
			}
		});
	}

});
$("button.login-b").click(function() {
	var email = $("form.login-form input.email").val();
	var password = $("form.login-form input.password").val();

	if (email == '' || password == '') {
		alert("Please fill login form!");
	} else {
		var userLogin = {
			email : email,
			password : password
		};

		$.post("login", userLogin, function(data) {
			if (data !== '') {
				var customUrl = '';
				var urlContent = window.location.href.split('/');
				for (var i = 0; i < urlContent.length - 1; i++) {
					customUrl += urlContent[i] + '/'
				}
				customUrl += data.destinationUrl;
				window.location = customUrl;
			}
			$("form")[0].reset();
		});
	}
});
