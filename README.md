# Java Socket Chat Application

This project is a simple chat application built using Java's socket programming and AWT (Abstract Window Toolkit) for a graphical user interface. It allows real-time communication between a server and a client through a local network using sockets.

---

## 🧰 Features
- Real-time messaging between server and client.
- Simple GUI using Java AWT.
- Bi-directional communication using sockets.
- Multi-threaded to handle incoming and outgoing messages simultaneously.

---

## 🛠️ Technologies Used
- **Java**: Core programming language.
- **Socket Programming**: For client-server communication.
- **AWT (Abstract Window Toolkit)**: To build a simple GUI.

---

## 🚀 How to Run

### Prerequisites
- JDK installed (Java Development Kit)
- An IDE (e.g., IntelliJ, Eclipse) or command line setup

### 1. Compile the Code
```sh
javac Server.java Client.java
```

### 2. Run the Server
```sh
java Server
```

### 3. Run the Client
```sh
java Client
```

### 4. Communication
- Type a message in the client's text field and click **Send** to transmit the message to the server.
- The server will receive and display the message and can reply in the same manner.

---

## 📝 Code Structure

### **Server.java**
- Sets up a server socket on port `12000`.
- Accepts client connections.
- Reads and displays messages from the client.
- Allows sending messages to the client.

### **Client.java**
- Connects to the server at `localhost:12000`.
- Sends and receives messages to/from the server.

---

## 📦 Example
1. Start the server first.
2. Then, start the client.
3. Type messages in both windows to see bi-directional communication.

---

## 📸 Demo

### **Client and Server Screenshots:**

#### User 1 View
![User1 View](https://drive.google.com/uc?id=185CTNlbqW1wK7jxXzeSeaEAZyyZWBaUB)

#### User 2 View
![User2 View](https://drive.google.com/file/d/1k2flDKq3s3ILc91tKvY0Rn3ucAmFFw2L)

---

## 🐞 Troubleshooting
- Ensure the server is running before starting the client.
- Make sure no other application is using port `12000`.
- If you encounter `Connection refused`, double-check the IP address and port.

---

## 📂 Project Directory
```
.
├── Client.java
├── Server.java
└── README.md
```

---

## 📄 License
This project is open-source and free to use.

