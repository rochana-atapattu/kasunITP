/**
 * 
 */

function init() {
	console.log("hi");
	addButton();
	searchButton();
}

/*
 * form.change(function() { console.log("changing"); })
 */
function addButton() {
	console.log("buttons init");

	$('#add').click(function() {
		var form = $('#form1');
		console.log("adding");

		$.ajax({
			type : 'post',
			url : 'addStudent',
			data : form.serialize(),
			success : function(data) {
				/*
				 * var result = data; $('#result').attr("value", result);
				 */
				console.log("added");
			}
		});
	});
}

function searchButton() {
	console.log("buttons init");
	var form = $('#form1');
	$('#search').click(function() {

		console.log("searching");

		var urlpttrn = form.attr('action');
		var data = {
			id : $('#Id').val()
		};
		$.ajax({
			type : 'get',
			url : 'addStudent',
			data : data,

			success : function() {

				console.log("found");
			/*	document.forms['form1'].reset();*/

			}
		});
	});
}
