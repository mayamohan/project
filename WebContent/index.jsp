<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="description"
	content="A front-end template that helps you build fast, modern mobile web apps.">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>All about US presidents</title>

<!-- Add to homescreen for Chrome on Android -->
<meta name="mobile-web-app-capable" content="yes">
<link rel="icon" sizes="192x192" href="images/android-desktop.png">

<!-- Add to homescreen for Safari on iOS -->
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="apple-mobile-web-app-title" content="Material Design Lite">
<link rel="apple-touch-icon-precomposed" href="images/ios-desktop.png">

<!-- Tile icon for Win8 (144x144 + tile color) -->
<meta name="msapplication-TileImage"
	content="images/touch/ms-touch-icon-144x144-precomposed.png">
<meta name="msapplication-TileColor" content="#3372DF">

<link rel="shortcut icon" href="images/favicon.png">


<link
	href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://storage.googleapis.com/code.getmdl.io/1.0.6/material.red-blue.min.css" />



<link rel="stylesheet" href="style.css">
<style>
#view-source {
	position: fixed;
	display: block;
	right: 0;
	bottom: 0;
	margin-right: 40px;
	margin-bottom: 40px;
	z-index: 900;
}
</style>
</head>
<body
	class="mdl-demo mdl-color--grey-100 mdl-color-text--grey-700 mdl-base">
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<header
			class="mdl-layout__header mdl-layout__header--scroll mdl-color--primary">
			<div class="mdl-layout--large-screen-only mdl-layout__header-row">
			</div>
			<div class="mdl-layout--large-screen-only mdl-layout__header-row">
				<h3>Team Critical mass, Project # 1</h3>
			</div>

			<div
				class="mdl-layout--large-screen-only mdl-layout__header-row mdl-color--primary-dark">
				<a href="#overview" class="mdl-layout__tab is-active">Members</a> <a
					href="#features" class="mdl-layout__tab"> Other Projects</a>


			</div>
		</header>
		<main class="mdl-layout__content">
		
<c:if test="${empty(sessionScope.presidents)}">		
			<div class = "container">	
		<div class="mdl-card mdl-shadow--4dp" id="firstpage">
					<div class="mdl-card__title">


					
						<h5>Choose A Presidents</h5>
					</div>
					<div class="mdl-card__supporting-text" id="textBox">

						<form action="PresidentServlet" method="GET">
							<div
								class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label"
								id="textboxx">

								<input type="number" placeholder="Enter term number"
									name="termNumber">

							</div>
							<div class="button1">
								<button type="submit" value="submit" name="submit"
									class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
									Submit</button>
							</div>
						</form>
					</div>
		</div>	
	</c:if>	
<c:if test="${! empty(sessionScope.presidents)}">
		<div class="mdl-grid">
			
				<div class="mdl-card mdl-shadow--4dp" id="trivia">
					<div class="mdl-card__title">
					<h1>Trivia</h1>
					</div>
					<div class = mdl-textfield">
					<h3>" ${presidents2.trivia }"</h3>

					
						<h5>Choose Another Presidents</h5>
					</div>
					<div class="mdl-card__supporting-text" id="textBox">

						<form action="PresidentServlet" method="GET">
							<div
								class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label"
								id="textboxx">

								<input type="number" placeholder="Enter term number"
									name="termNumber">

							</div>
							<div class="button1">
								<button type="submit" value="submit" name="submit"
									class="mdl-button mdl-js-button mdl-button--raised mdl-button--colored">
									Submit</button>
							</div>
						</form>
					</div>
			
		</div>
		<div class="mdl-card mdl-shadow--6dp" id="maincard">
			<figure class="mdl-card__media">
				<img src="${presidents2.portrait }" alt="https://en.wikipedia.org/wiki/Franklin_D._Roosevelt" />
			</figure>
			  <div class="mdl-card__title">
    <h1 class="mdl-card__title-text"> ${presidents2.name } </h1>
  </div>
			<div class="button-container">
				<form action="PresidentServlet" method="GET" id="formbutton1">
					<button
						class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent"
						id="button1" type="submit" value="${termNumber}"
						name="termNumber2">Prev</button>

					<button type="submit" value="${termNumber}" name="termNumber3"
						class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent"
						id="button2">Next</button>
				</form>
			</div>

			<a href="${presidents2.link }"
				class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect"
				id=readmoreLink> Read More </a>

		</div>

</c:if>


<c:if test="${! empty(sessionScope.presidents)}">
		<div class="mdl-card mdl-shadow--4dp" id="overview">

			
				<h5>Presidents chosen</h5>
				<table
					class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp"
					id="main-table">
					<tr>
						<th class="mdl-data-table__cell--non-numeric">Term Number</th>
						<th>First Name</th>
						<th>Last Name</th>

					</tr>



					<c:forEach var="president" items="${sessionScope.presidents}">
						<thead>

						</thead>

						<tbody>
							<tr class="mainrows">
								<td class="mdl-data-table__cell--non-numeric">${president.termNumber}</td>
								<td>${president.firstName }</td>
								<td>${president.lastName }</td>
							</tr>

						</tbody>

					</c:forEach>
					
				</table>
		</div>
	</div>
</c:if>


	<footer class="demo-footer mdl-mini-footer">
		<div class="mdl-mini-footer--left-section">
			<ul class="mdl-mini-footer--link-list">
				<li><a href="#">© skill Distllary </a></li>

				<li><a href="#">Team name</a></li>
			</ul>
		</div>
	</footer>
	</main>
</body>
</html>