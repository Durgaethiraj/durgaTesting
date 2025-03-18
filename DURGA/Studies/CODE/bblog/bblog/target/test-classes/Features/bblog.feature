Feature: To create,edit and delete article

Background: 
Given I Landed in bblog Home page 
	
@bblogsignup 
Scenario Outline: To Signup in bblog 	
	
	And I click signup
	And I enter username "<user name>"
	And I enter emailid "<email id>"
	And I enter password "<password>"
	Then I should able to click Sign Up
	Then I close the browser
	
	Examples: 
		|user name|email id|password|
		|test39|test39@gmail.com|welcome5|
		
		
@bblogcreateArticle
Scenario: To create new article
     And I click signin
     And I enter username "<Username>"
	 And I enter password "<password>"
     And I click signin button
	 And I click NewPost
	 And I enter Article title "<articletitle>"
	 And I enter Article about "<what't your title about>"
	 And I enter Article details "<write your article>"
	 And I enter Article tag "<Enter your Tags>"
	 Then I click Publish Article
	 Then I close the browser
	 
	Examples:
	|Username|password|articletitle|what't your title about|write your article|Enter your Tags|
	|test29@gmail.com|welcome1|Testing|Testing Methodologies|Waterfall,V-Model and Agile|Testing|
	

@bblogEditArticle
Scenario Outline: To edit new article
     And I click signin
     And I enter username "<Username>"
	 And I enter password "<password>"
     And I click signin button
     And I click username link
     And I click article
     And I click Edit Article
     And I enter Article title "<articletitle>"
	 Then I click Publish Article
	 Then I close the browser
	Examples:
	|Username|password|articletitle|what't your title about|write your article|Enter your Tags|
	|test29@gmail.com|welcome1|Testing123|Testing Methodologies-part1|Waterfall model|TestingWaterFall|

@bblogDeleteArticle
Scenario Outline: To delete a article
     And I click signin
     And I enter username "<Username>"
	 And I enter password "<password>"
     And I click signin button
     And I click username link
     And I click article
     Then I click delete article
     Then I close the browser
Examples: 
	| Username | password|
	| test29@gmail.com |welcome1|