import express from "express";
import { WebSocketServer } from "ws";
import path from "path";
import { fileURLToPath } from "url";

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const app = express();
const port = 9090;

// Middleware to serve static files from the client
app.use(express.static(path.join(__dirname, '../../client/public')));

const server = app.listen(port, () => {
    console.log(`Server running on http://localhost:${port}`);
});
//implementation of websocket server
const wss = new WebSocketServer({ server });
const clients = new Set();

wss.on("connection", (ws) => {
    clients.add(ws);
    console.log(`New client connected. Total: ${clients.size}`);

    // Welcome message
    ws.send(JSON.stringify({
        type: "system",
        message: "Welcome to RealChat!",
        timestamp: new Date().toISOString()
    }));

    // Broadcast new user joined
    broadcast({
        type: "system",
        message: "A new user joined the chat",
        timestamp: new Date().toISOString()
    }, ws);

    ws.on("message", (data) => {
        const message = data.toString();
        console.log(`Received: ${message}`);
        
        broadcast({
            type: "message",
            message: message,
            timestamp: new Date().toISOString()
        }, ws);
    });

    ws.on("close", () => {
        clients.delete(ws);
        console.log(`Client disconnected. Total: ${clients.size}`);
        
        broadcast({
            type: "system",
            message: "A user left the chat",
            timestamp: new Date().toISOString()
        });
    });

    ws.on("error", (error) => {
        console.error("WebSocket error:", error);
    });
});

function broadcast(data, sender = null) {
    const message = JSON.stringify(data);
    clients.forEach(client => {
        if (client !== sender && client.readyState === client.OPEN) {
            client.send(message);
        }
    });
}