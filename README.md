# Bookstore
Welcome to Book Store, a Java-based system that simulates an online bookstore designed using object-oriented programming principles.
**Classes used:
Book:a class that represents the book in general with its attributes :ISBN,title,price,publication date and  yearstobecomeOld

Paperbook: Physical book with stock and shipping.

EBook: Digital book with file type, sent via email.

Demobook: Demo or sample books that are not for sale.

** interfaces used:
shippable:to implemented by paperbooks.

isPurchasable:used to differentiate between books that are purchasable and non-purchasable,implemented by all books

sendViaEmail:implemented by EBooks only.

**Operations supported:

Add books to the inventory.

Remove outdated books based on publication year.

Purchase a book by providing its ISBN, quantity, email, and shipping address.

Automatically handles digital and physical delivery channels.(via email or by Shipping service)
 

