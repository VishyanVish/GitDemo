
$(document).ready(function(){
  $('#formDataForm').submit(function(ev){
    ev.preventDefault();
    var formData={
     name:$('#FirstName').val(),
     age:$('#Age').val(),
     Mobile:$('#mobile_number').val(),
     gender:$('#gender').val(),
     email:$('#email').val(),
     password:$('#Password').val(),
     date:$('#date').val(), 
    }

$.ajax({
type: "POST",
contentType: "application/json",
url: "/submitFormData",
data: JSON.stringify(formData),
dataType: "json",
success: function(response) {
    console.log("Form data submitted successfully:", response);
},
error: function(error) {
    console.error("Error submitting form data:", error);
}
});
}

)
 })
