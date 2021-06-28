
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="css/application.css">
<title>Document</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body >

	<h1 id="companyname">XYZ Pvt Ltd</h1>

	<div class="applyjob">

		
		<div class="inputform">
					<h2>Basic Details</h2>
			<form:form method="POST" action="/register" modelAttribute="user">
			
					<div>
					<form:label path="firstName">First Name :</form:label>
                    <form:input type="text" path="firstName"/><!--</td>
                	
                </tr>
                
                <tr>
                <td>-->
	                <form:label path="lastName">Last Name :</form:label>
	                <form:input type="text" path="lastName"/>
	                    
                    <form:label path="contactNumber">Contact Number :</form:label>
                    <form:input type="text" path="contactNumber"/>
                    
                    <form:label path="gender">Gender :</form:label>
                    <form:select path="gender">
                    	<form:option value="selected" disabled="true" selected="selected" />
	                    <form:option value="M" label="Male" /> 
						<form:option value="F" label="Female" />
						<form:option value="O" label="Other" /> 
                   </form:select>
                    
                    <form:label path="email">Email :</form:label>
                    <form:input type="email" path="email"/>
                    
                    <form:label path="skills">Skills :</form:label>
                    <form:input type="text" path="skills"/>
            
            		<form:label path="currentEmployer">Current Employer :</form:label>
                    <form:input type="text" path="currentEmployer"/>
                    
                    <form:label path="workexperience">Work Experience :</form:label>
                    <form:input type="text" path="workexperience"/>
                    
                    <form:label path="currentCTC">Current CTC (in Lakhs) :</form:label>
                    <form:input type="text" path="currentCTC"/>
                    
                    <form:label path="expectedCTC">Expected CTC (in Lakhs):</form:label>
                    <form:input type="text" path="expectedCTC"/>
                    
            <input id="submit" type="submit" value="Submit"/>
					</div>
             		
        </form:form>
			
		</div>
		

	</div>




</body>
</html>