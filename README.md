# Celfocus challenge

# 1. Email Test

### Scenario: User sends a message to a Message Server.

Implement code in so that the following Acceptance Criteria is met:

```gherkin
Given A User sends an "hello" message
When The message is converted by the Adapter
Then The Message server should contain the "hello" message in the queue
```

# Objective

The main objective of this small project is to implement a flow oriented approach of an email service.

An user trigger and event by sending a message (Action)* -> the message is adapted by the email adapter -> the email event send the message to the server.

The first message in the server queue must be the first message sended (FIFO).

*Action is a [tuple](https://www.javatuples.org/using.html) defined by the type of message and body of the message.

To acomplish that, the project uses the flow framework developed by [Rafael Pinto](https://github.com/rafaelspinto/flow).

