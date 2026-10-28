document.addEventListener('DOMContentLoaded', () => {
    const chatContainer = document.getElementById('chat-container');
    const messageInput = document.getElementById('message-input');
    const sendButton = document.getElementById('send-button');
    
    // Connect to WebSocket server
    const ws = new WebSocket('ws://localhost:9090');
    
    ws.onopen = () => {
        console.log('Connected to chat server');
        addSystemMessage('Connected to chat server');
    };
    
    ws.onmessage = (event) => {
        try {
            const data = JSON.parse(event.data);
            addMessageToChat(data, false); // false means received message
        } catch (e) {
            console.error('Error parsing message:', e);
        }
    };
    
    ws.onerror = (error) => {
        console.error('WebSocket error:', error);
        addSystemMessage('Connection error occurred');
    };
    
    ws.onclose = () => {
        console.log('Disconnected from chat server');
        addSystemMessage('Disconnected from chat server');
    };
    
    // Event listeners
    sendButton.addEventListener('click', sendMessage);
    messageInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') sendMessage();
    });
    
    function sendMessage() {
        const message = messageInput.value.trim();
        if (message && ws.readyState === ws.OPEN) {
            const messageData = {
                message: message,
                timestamp: new Date().toISOString()
            };
            
            // Add the message to chat immediately (optimistic UI update)
            addMessageToChat(messageData, true);
            
            // Send the message to server
            ws.send(JSON.stringify(messageData));
            
            // Clear input
            messageInput.value = '';
        }
    }
    
    function addMessageToChat(data, isSent) {
        const messageDiv = document.createElement('div');
        messageDiv.className = `message ${isSent ? 'sent-message' : 'received-message'}`;
        
        // Create message elements safely (avoiding innerHTML when possible)
        const contentDiv = document.createElement('div');
        contentDiv.className = 'message-content';
        contentDiv.textContent = data.message; // Using textContent for security
        
        const timeDiv = document.createElement('div');
        timeDiv.className = 'timestamp';
        timeDiv.textContent = formatTimestamp(data.timestamp);
        
        // Clear the div first (good practice)
        // messageDiv.textContent = '';
        
        // Append elements properly
        messageDiv.appendChild(contentDiv);
        messageDiv.appendChild(timeDiv);
        
        // Add avatar for received messages
        if (!isSent) {
            const avatar = document.createElement('div');
            avatar.className = 'message-avatar';
            const icon = document.createElement('i');
            icon.className = 'fas fa-user';
            avatar.appendChild(icon);
            messageDiv.insertBefore(avatar, contentDiv);
        }
        
        // Add status for sent messages
        if (isSent) {
            const status = document.createElement('div');
            status.className = 'message-status';
            const icon = document.createElement('i');
            icon.className = 'fas fa-check';
            status.appendChild(icon);
            messageDiv.appendChild(status);
        }
        
        chatContainer.appendChild(messageDiv);
        chatContainer.scrollTop = chatContainer.scrollHeight;
    }
    
    function addSystemMessage(message) {
        const systemDiv = document.createElement('div');
        systemDiv.className = 'message system-message';
        systemDiv.textContent = message;
        systemDiv.style.alignSelf = 'center';
        systemDiv.style.backgroundColor = 'transparent';
        systemDiv.style.color = '#666';
        systemDiv.style.fontSize = '0.8rem';
        systemDiv.style.padding = '5px 10px';
        chatContainer.appendChild(systemDiv);
        chatContainer.scrollTop = chatContainer.scrollHeight;
    }
    
    function formatTimestamp(timestamp) {
        const date = new Date(timestamp);
        return date.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit' });
    }
});