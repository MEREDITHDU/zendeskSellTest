# zendeskSellTest
This task is to write a front end OR API automated test in a language and framework of your choice which covers the following scenario:

Preconditions:

A Zendesk sell account.
Test steps (frontend option)

Log into the Zendesk sell web application (using the account).
Create a new Lead.
Check that the Lead status visible on the details page is set to "New"
Go into Settings -> Leads -> Lead statuses and change the name of the "New" status to some different name
Expected result:

The status name change is reflected on the Lead details page.
Test steps (API option)

Create a new Lead using public API (https://developers.getbase.com/) without any address
Using API check if lead exists
Update lead address
Expected result:

Using API check if lead was updates with correct address
Points to focus on:

Publish the code as a GitHub or a private Bitbucket repo
Adding a new test scenario should be easy
If you have any questions about the task or expected outcomes, please feel free to ask us
