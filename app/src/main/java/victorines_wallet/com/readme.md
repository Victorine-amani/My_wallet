You are building a mobile wallet app in which a transaction is represented using a
data class with the following attributes:
- Description - A description of the transaction
- Reference - Transaction reference number
- Date - When the transaction occurred
- Amount - The value of the transaction
- TransactionType - Either DEBIT or CREDIT. 
  A debit is a transaction that
  DEBIT-INCREASES THE BALANCE 
  a credit transaction 
  CREDIT-REDUCES THE BALANCE.
  Implement an activity that displays a list of transactions. There ought to be a visual
  distinction between a debit and a credit. Your users should also be able to view their
  account details on the same activity, including Account Name, Currency, Balance
  and average transaction amounts.