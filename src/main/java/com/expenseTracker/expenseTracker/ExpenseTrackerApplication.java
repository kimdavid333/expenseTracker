package com.expenseTracker.expenseTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackerApplication {


/* EXPENSE TRACKER PROJECT
As a user, I should be able tO;
	1. Add an expense to my account that contains:
		- Name of what I bought
		- How much I spent,
		- Note about purchase
		- Date of purchase
	2. Categorize my expenses:
		- in default categories
		- in user created custom categories
	3. Sort them according to
		- date
		- amount spent
	4. Set weekly or monthly expense goals:
		- app will notify user if he/she is near limit (or go over)
	5. Persist my data in a database (PostgreSQL)
		- HEROKU
	6. Auto-generate email for summary

 */

	public static void main(String[] args) {
		SpringApplication.run(ExpenseTrackerApplication.class, args);
	}



}
