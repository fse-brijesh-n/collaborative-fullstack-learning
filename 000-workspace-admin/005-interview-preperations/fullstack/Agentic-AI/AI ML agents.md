AI/ML from Zero – A Complete Guide for Java Developers

This guide assumes you are a Java developer with no prior knowledge of AI/ML or Python. We will start from the very basics and gradually build up to building production‑ready LLM applications, including RAG, MCP, agents, and even training your own model.
All core concepts are explained using simple analogies, and every section includes working Java and Python code side by side.
Even though Python is the dominant language in AI, you can do everything in Java as well – we'll show you how.

---

Table of Contents

1. What this Guide is and Who it’s for
2. Part 1: AI/ML Foundations – No Magic, Just Numbers
   · 2.1 What is AI / ML / DL?
   · 2.2 Neural Networks in a Nutshell
   · 2.3 From Traditional NLP to Large Language Models
   · 2.4 Tokens, Embeddings, and Context Windows
   · 2.5 How a Model “Learns”: Training, Fine‑tuning, Inference
3. Part 2: Setting Up Your Environment
   · 3.1 Java Setup (Maven / Gradle)
   · 3.2 Python Setup (just enough to run examples)
   · 3.3 API Keys and Local Models
4. Part 3: Your First LLM Call
   · 3.1 Java with LangChain4j / OpenAI API
   · 3.2 Python with OpenAI API
   · 3.3 Basic Prompt Engineering
5. Part 4: Making the Model Smart with External Knowledge – RAG
   · 4.1 The RAG Idea
   · 4.2 Implementing RAG in Java (LangChain4j + Chroma)
   · 4.3 Implementing RAG in Python (LangChain + Chroma)
   · 4.4 Improving Retrieval: Re‑ranking, Hybrid Search
6. Part 5: Connecting LLMs to the World – Tool Use & Function Calling
   · 5.1 The Concept of Tools
   · 5.2 Java Example (LangChain4j @Tool)
   · 5.3 Python Example (OpenAI function calling)
7. Part 6: Model Context Protocol (MCP) – A Universal Connector
   · 6.1 What is MCP and Why Does It Matter?
   · 6.2 Building an MCP Server and Client in Python
   · 6.3 MCP in Java (Spring AI)
8. Part 7: Autonomous Agents
   · 7.1 The ReAct Pattern
   · 7.2 A Complete Agent in Java (LangChain4j)
   · 7.3 A Complete Agent in Python (LangChain)
9. Part 8: Training Your Own Model on Custom Data
   · 8.1 When and Why to Fine‑tune
   · 8.2 Fine‑tuning in Python – Step by Step (Hugging Face)
   · 8.3 Using the Fine‑tuned Model in Java
   · 8.4 Fine‑tuning Directly in Java? (Yes, with DJL)
10. Part 9: Production Tips and Common Pitfalls
11. Resources and Where to Go Next

---

1. What this Guide is and Who it’s for

You are a Java developer. You’ve never written a line of Python, and the closest you’ve been to AI is maybe using ChatGPT as a user.
This guide will take you from absolute zero to being able to:

· Understand what LLMs really are (no magic).
· Call them from Java and Python.
· Build a RAG system that answers questions from your own documents.
· Create agents that can use tools (like a calculator or a weather API).
· Implement the Model Context Protocol (MCP) to standardise tool connections.
· Finally, fine‑tune your own model on custom data and use it in your applications.

We’ll explain every AI concept using simple analogies and always show code in both Java and Python.
When we need Python, we’ll treat it as just another programming language – the logic is the same, only the syntax differs.

Prerequisites: Java 17+, Maven or Gradle, and an internet connection. That’s it. We’ll set up Python together.

---

2. Part 1: AI/ML Foundations – No Magic, Just Numbers

2.1 What is AI / ML / DL?

· Artificial Intelligence (AI): A broad field – building machines that behave intelligently.
· Machine Learning (ML): A subset of AI where systems learn from data instead of being explicitly programmed.
  Example: Instead of writing if email contains "buy now" rules, you feed thousands of emails labelled “spam” / “not spam” and the computer finds patterns.
· Deep Learning (DL): A subset of ML that uses many‑layered neural networks (inspired loosely by the brain). This is what powers modern LLMs.

Analogy for Java developers:

· Traditional programming = you write a class with a rigid method that processes input.
· ML = you write a generic class (a model) and then train it by feeding examples until its behaviour is correct. The model is essentially a huge set of numerical parameters (weights).

2.2 Neural Networks in a Nutshell

A neural network is a chain of mathematical operations. For text, the most important architecture is the Transformer (introduced in 2017). Its core idea is attention – the model learns which words in a sentence are important to understand each other word.

Think of attention like a Java HashMap: you query with a word, and the attention mechanism returns a weighted combination of all other words, telling the model which parts of the context are relevant.

2.3 From Traditional NLP to Large Language Models

Older NLP models were task‑specific (e.g., one model for translation, another for summarisation). LLMs are pre‑trained on massive text (the whole internet) and can perform many tasks out of the box by giving them instructions in natural language.

Key takeaway: An LLM is essentially a function:

```
String -> String
```

Given a prompt (String), it predicts the next token, token by token, generating a complete response.

2.4 Tokens, Embeddings, and Context Windows

· Token: The atomic unit of text the model processes. A word can be split into several tokens. English text roughly has 1 token ≈ 0.75 words.
  Example: "Hello, world!" might be [15496, 11, 995, 0] in GPT‑4’s tokenizer.
  · Java analogy: A token is like a char in a String, but not exactly – it’s a piece that the model knows.
· Embedding: A list of floating‑point numbers (a vector) that represents the meaning of a token (or a whole sentence) in a high‑dimensional space. Words with similar meanings are close together.
  Java analogy: Like a complex hashCode() that gives you a semantic “fingerprint”.
· Context Window: The maximum number of tokens the model can process at once (e.g., 128k for GPT‑4‑turbo). Longer than this gets truncated.

2.5 How a Model “Learns”: Training, Fine‑tuning, Inference

· Training (pre‑training): Start from random weights. Show the model billions of sentences and ask it to predict the next word. After many months on thousands of GPUs, it learns language, facts, reasoning.
· Fine‑tuning: Take a pre‑trained model and train it a bit more on a small, specific dataset (e.g., your company’s support tickets) so it becomes better at that domain. We’ll do this in Part 8.
· Inference: Using the trained model to generate answers. This is what we do when we call an API or run a local model.

---

3. Part 2: Setting Up Your Environment

We’ll keep it simple. You don’t need to become a Python expert – we’ll use it only where necessary (fine‑tuning). For day‑to‑day LLM application development, you can stick to Java.

3.1 Java Setup

We’ll use Maven. Add the following dependencies to your pom.xml:

```xml
<dependencies>
  <!-- LangChain4j for LLM abstraction -->
  <dependency>
    <groupId>dev.langchain4j</groupId>
    <artifactId>langchain4j</artifactId>
    <version>0.31.0</version>
  </dependency>
  <!-- OpenAI module -->
  <dependency>
    <groupId>dev.langchain4j</groupId>
    <artifactId>langchain4j-open-ai</artifactId>
    <version>0.31.0</version>
  </dependency>
  <!-- Chroma vector store (for RAG) -->
  <dependency>
    <groupId>dev.langchain4j</groupId>
    <artifactId>langchain4j-chroma</artifactId>
    <version>0.31.0</version>
  </dependency>
  <!-- SLF4J for logging -->
  <dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>2.0.7</version>
  </dependency>
</dependencies>
```

If you prefer Gradle, translate accordingly.

Make sure you have Java 17 or later.

3.2 Python Setup (just enough)

Install Python 3.10+ from python.org.
Then, in a terminal, create a virtual environment and install the required libraries:

```bash
python -m venv ai-env
source ai-env/bin/activate        # On Windows: ai-env\Scripts\activate
pip install openai langchain langchain-community chromadb tiktoken
```

That’s it. We’ll only run Python scripts for specific tasks (like fine‑tuning). All code is provided.

3.3 API Keys and Local Models

To call GPT‑4, you need an OpenAI API key. Sign up at platform.openai.com, create a key, and set it as an environment variable:

```bash
export OPENAI_API_KEY="sk-..."
```

For offline experimentation, you can use open‑source models like Llama 3 via Ollama.
We’ll cover that later.

---

4. Part 3: Your First LLM Call

4.1 Java with LangChain4j (OpenAI)

```java
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;

public class FirstCall {
    public static void main(String[] args) {
        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .modelName("gpt-4")   // or "gpt-3.5-turbo"
                .build();

        String answer = model.generate("Say hello in Java style.");
        System.out.println(answer);
    }
}
```

Run it – you’ll get something like "System.out.println(\"Hello, world!\");".

4.2 Python with OpenAI

```python
from openai import OpenAI
client = OpenAI()

response = client.chat.completions.create(
    model="gpt-4",
    messages=[{"role": "user", "content": "Say hello in Python style."}]
)
print(response.choices[0].message.content)
```

4.3 Basic Prompt Engineering

The quality of the answer depends heavily on how you ask.
Prompt engineering is about crafting the input text.
Some tricks:

· Be specific – “Explain how garbage collection works in Java” vs “Tell me about GC”.
· Give examples (few‑shot) – “Classify: ‘I love this’ -> positive, ‘I hate it’ -> negative. Now classify: ‘It’s okay’”.
· Chain of thought – add “Let’s think step by step” to the prompt.

Both Java and Python use the same prompt strings, so just experiment.

---

5. Part 4: Making the Model Smart with External Knowledge – RAG

LLMs only know what they were trained on (up to a cutoff date). RAG lets you inject your own documents at query time.

5.1 The RAG Idea

1. You have a bunch of documents (PDFs, text files, etc.).
2. Split them into small chunks (e.g., 500 characters each).
3. For each chunk, compute its embedding (a vector of 1536 numbers) using an embedding model.
4. Store all chunks + vectors in a vector database.
5. When a user asks a question, embed the question and find the most similar chunks (by vector similarity).
6. Take the top 3 chunks, stuff them into the prompt as “Context: …”, then ask the LLM to answer based on that context.

This way, the model can answer about things it has never seen.

5.2 RAG in Java (LangChain4j + Chroma)

We’ll use Chroma as the vector DB. Install and run Chroma locally:

```bash
docker run -p 8000:8000 chromadb/chroma
```

Now the code:

```java
import dev.langchain4j.data.document.Document;
import dev.langchain4j.data.document.DocumentSplitter;
import dev.langchain4j.data.document.splitter.DocumentSplitters;
import dev.langchain4j.data.embedding.Embedding;
import dev.langchain4j.data.segment.TextSegment;
import dev.langchain4j.model.embedding.EmbeddingModel;
import dev.langchain4j.model.openai.OpenAiEmbeddingModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.store.embedding.EmbeddingStore;
import dev.langchain4j.store.embedding.chroma.ChromaEmbeddingStore;
import java.util.List;
import java.util.stream.Collectors;

public class RagJava {
    public static void main(String[] args) {
        // 1. Load document (for simplicity, a hardcoded string)
        String text = "Our return policy: returns accepted within 30 days with receipt.";
        Document document = Document.from(text);
        DocumentSplitter splitter = DocumentSplitters.recursive(500, 0);
        List<TextSegment> segments = splitter.split(document);

        // 2. Embedding model
        EmbeddingModel embeddingModel = OpenAiEmbeddingModel.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .build();

        // 3. Store in Chroma
        EmbeddingStore<TextSegment> chroma = ChromaEmbeddingStore.builder()
                .baseUrl("http://localhost:8000")
                .collectionName("my-knowledge")
                .build();

        List<Embedding> embeddings = embeddingModel.embedAll(
                segments.stream().map(TextSegment::text).collect(Collectors.toList())
        ).content();
        chroma.addAll(embeddings, segments);

        // 4. Query
        String query = "Can I return an item after 20 days?";
        Embedding queryEmbedding = embeddingModel.embed(query).content();
        List<TextSegment> relevant = chroma.findRelevant(queryEmbedding, 2);

        // 5. Generate answer
        ChatLanguageModel chatModel = OpenAiChatModel.builder()
                .apiKey(System.getenv("OPENAI_API_KEY"))
                .modelName("gpt-4")
                .build();
        String context = relevant.stream().map(TextSegment::text).collect(Collectors.joining("\n\n"));
        String prompt = "You are a helpful assistant. Use the following context to answer the question.\n\n" +
                        "Context:\n" + context + "\n\n" +
                        "Question: " + query;
        String answer = chatModel.generate(prompt);
        System.out.println("Answer: " + answer);
    }
}
```

Explanation for Java developers:

· We split the document into TextSegment objects.
· We embed them into Embedding (a list of floats).
· ChromaEmbeddingStore implements EmbeddingStore – a bit like a Map<Embedding, TextSegment> but optimised for similarity search.
· findRelevant returns the top‑k segments by cosine similarity (the angle between vectors).

5.3 RAG in Python (LangChain)

```python
from langchain.document_loaders import TextLoader
from langchain.text_splitter import RecursiveCharacterTextSplitter
from langchain.embeddings.openai import OpenAIEmbeddings
from langchain.vectorstores import Chroma
from langchain.chains import RetrievalQA
from langchain.chat_models import ChatOpenAI

# 1. Load and split
loader = TextLoader("policy.txt")  # a file on disk
docs = loader.load()
splitter = RecursiveCharacterTextSplitter(chunk_size=500, chunk_overlap=50)
chunks = splitter.split_documents(docs)

# 2. Create vector store
embedding = OpenAIEmbeddings()
vectorstore = Chroma.from_documents(chunks, embedding, collection_name="my-knowledge")

# 3. Build QA chain
qa = RetrievalQA.from_chain_type(
    llm=ChatOpenAI(model="gpt-4", temperature=0),
    retriever=vectorstore.as_retriever(search_kwargs={"k": 2})
)

# 4. Ask
result = qa.run("Can I return an item after 20 days?")
print(result)
```

5.4 Improving Retrieval

· Re‑ranking: after initial retrieval, use a cross‑encoder to re‑score chunks (Python: sentence-transformers; Java: use Deep Java Library).
· Hybrid search: mix dense (embedding) and sparse (BM25) results. LangChain4j supports this via Filter.

---

6. Part 5: Connecting LLMs to the World – Tool Use & Function Calling

LLMs can't call APIs or do math by themselves. But we can teach them to request a function call, and we execute it.

Analogy: You write a Java method getWeather(String city) and give the LLM its signature. When the user asks “What’s the weather in London?”, the LLM replies with a structured request {"function": "getWeather", "arguments": {"city":"London"}}. Your code calls the method, gets the result, and sends it back to the LLM for a final answer.

6.1 Java – @Tool with LangChain4j

```java
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.SystemMessage;

interface Assistant {
    String chat(String userMessage);
}

class WeatherTools {
    @Tool("Get current weather for a city")
    public String getWeather(@P("City name") String city) {
        // In reality, call a REST API
        return "It's sunny in " + city + ", 22°C";
    }
}

public class ToolExample {
    public static void main(String[] args) {
        Assistant assistant = AiServices.builder(Assistant.class)
                .chatLanguageModel(OpenAiChatModel.builder()
                        .apiKey(System.getenv("OPENAI_API_KEY"))
                        .modelName("gpt-4")
                        .build())
                .tools(new WeatherTools())
                .chatMemory(MessageWindowChatMemory.withMaxMessages(10))
                .build();

        String answer = assistant.chat("What's the weather in Tokyo?");
        System.out.println(answer);
    }
}
```

Under the hood, LangChain4j automatically handles the tool‑call loop.

6.2 Python – OpenAI Function Calling

```python
import openai, json
client = openai.OpenAI()

def get_weather(location):
    return f"Sunny in {location}, 22°C"

tools = [{
    "type": "function",
    "function": {
        "name": "get_weather",
        "description": "Get current weather",
        "parameters": {
            "type": "object",
            "properties": {
                "location": {"type": "string"}
            },
            "required": ["location"]
        }
    }
}]

messages = [{"role": "user", "content": "What's the weather in Paris?"}]
response = client.chat.completions.create(model="gpt-4", messages=messages, tools=tools)
msg = response.choices[0].message

if msg.tool_calls:
    # execute function
    tool_call = msg.tool_calls[0]
    func_name = tool_call.function.name
    args = json.loads(tool_call.function.arguments)
    if func_name == "get_weather":
        result = get_weather(args["location"])
    # send result back
    messages.append(msg)
    messages.append({"role": "tool", "content": result, "tool_call_id": tool_call.id})
    final_response = client.chat.completions.create(model="gpt-4", messages=messages)
    print(final_response.choices[0].message.content)
```

---

7. Part 6: Model Context Protocol (MCP) – A Universal Connector

MCP is a new standard (by Anthropic) that makes connecting AI applications to external tools as simple as plugging in a server.
Think of it as JDBC but for AI tools – any MCP client can talk to any MCP server without writing custom glue code.

7.1 Why MCP?

Without MCP, every developer reinvents the wheel: parsing tool definitions, handling JSON, managing state. MCP solves that by defining:

· Server – exposes tools and resources.
· Client – discovers and calls those tools.
· Transport – stdio or HTTP.

The AI model can dynamically see what tools are available.

7.2 Building an MCP Server & Client in Python

We’ll create a tiny server that provides the current time.

Server (save as time_server.py):

```python
import asyncio, datetime
from mcp.server import Server
from mcp.server.stdio import stdio_server
from mcp.types import Tool, TextContent

server = Server("time-server")

@server.list_tools()
async def list_tools():
    return [Tool(name="get_current_time", description="Get the current time", inputSchema={"type":"object","properties":{}})]

@server.call_tool()
async def call_tool(name: str, arguments: dict):
    if name == "get_current_time":
        now = datetime.datetime.now().isoformat()
        return [TextContent(type="text", text=now)]
    raise ValueError(f"Unknown tool: {name}")

async def main():
    async with stdio_server() as (read, write):
        await server.run(read, write, server.create_initialization_options())

if __name__ == "__main__":
    asyncio.run(main())
```

Client (save as time_client.py):

```python
import asyncio
from mcp import ClientSession, StdioServerParameters
from mcp.client.stdio import stdio_client

async def main():
    server_params = StdioServerParameters(command="python", args=["time_server.py"])
    async with stdio_client(server_params) as (read, write):
        async with ClientSession(read, write) as session:
            await session.initialize()
            tools = await session.list_tools()
            print("Available tools:", tools)
            result = await session.call_tool("get_current_time", {})
            print("Time:", result.content[0].text)

asyncio.run(main())
```

Run the client: python time_client.py. You’ll see the current time printed. The client never knew the server’s logic.

7.3 MCP in Java (Spring AI)

Spring AI provides an MCP integration (still evolving, but usable).

Server (Spring Boot application):

```java
// File: TimeServerApp.java
import org.springframework.ai.mcp.server.McpServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Map;

@SpringBootApplication
public class TimeServerApp {
    public static void main(String[] args) {
        SpringApplication.run(TimeServerApp.class, args);
    }

    @Bean
    McpServer mcpServer() {
        return McpServer.builder()
            .tool("get_current_time", "Get the current time", Map.of(), args ->
                Map.of("time", LocalDateTime.now().toString()))
            .build();
    }
}
```

Client (using Spring AI’s MCP client):

```java
import org.springframework.ai.mcp.client.McpClient;
import org.springframework.ai.mcp.client.transport.StdioClientTransport;

public class McpClientExample {
    public static void main(String[] args) {
        var transport = new StdioClientTransport(
            new StdioClientTransport.Parameters("python", List.of("time_server.py"))
        );
        var client = McpClient.create(transport);
        client.initialize();
        var tools = client.listTools();
        System.out.println("Tools: " + tools);
        var result = client.callTool("get_current_time", Map.of());
        System.out.println("Time: " + result.get(0));
    }
}
```

Note: Add Spring AI MCP starter to your Maven dependencies.

---

8. Part 7: Autonomous Agents

An agent goes one step beyond simple tool calling: it can plan, use multiple tools, and correct itself.

The most common pattern is ReAct (Reasoning + Acting). The agent thinks: “I need to do X. To do X, I need tool Y. I’ll call Y, see the result, then decide the next step.”

8.1 ReAct in Java (LangChain4j)

```java
import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.agent.tool.P;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.service.AiServices;
import dev.langchain4j.service.SystemMessage;

interface MathAgent {
    @SystemMessage("You are a math assistant. Use the calculator tool when needed.")
    String solve(String problem);
}

class CalcTools {
    @Tool("Perform a calculation. Expression can be like '2+2'")
    public double calculate(@P("Expression to evaluate") String expr) {
        // Simple eval (for demo only)
        return Double.parseDouble(expr);
    }
}

public class AgentDemo {
    public static void main(String[] args) {
        MathAgent agent = AiServices.builder(MathAgent.class)
                .chatLanguageModel(OpenAiChatModel.builder()
                        .apiKey(System.getenv("OPENAI_API_KEY"))
                        .modelName("gpt-4")
                        .build())
                .tools(new CalcTools())
                .chatMemory(MessageWindowChatMemory.withMaxMessages(20))
                .build();

        String result = agent.solve("What is the square root of 144?");
        System.out.println(result);
    }
}
```

8.2 ReAct in Python (LangChain)

```python
from langchain.agents import initialize_agent, AgentType
from langchain.tools import Tool
from langchain.chat_models import ChatOpenAI

def calculate(expr):
    return str(eval(expr))

tools = [Tool(name="Calculator", func=calculate, description="Performs arithmetic")]
agent = initialize_agent(tools, ChatOpenAI(model="gpt-4", temperature=0),
                         agent=AgentType.ZERO_SHOT_REACT_DESCRIPTION, verbose=True)
agent.run("What is 12 * 15?")
```

The agent will output its thought process, call the calculator, and combine the result into a final answer.

---

9. Part 8: Training Your Own Model on Custom Data

You have a special dataset (e.g., your company’s internal documentation, a specific language, or a particular writing style) and you want the model to be better at it. Fine‑tuning is the solution.

8.1 When to Fine‑tune vs RAG

· RAG is best when you need the model to answer specific, factual questions based on a knowledge base that changes frequently.
· Fine‑tuning is better when you want the model to adopt a certain tone, format, or domain‑specific reasoning (e.g., medical diagnosis, legal contracts).

8.2 Fine‑tuning in Python (Hugging Face) – Step by Step

We will fine‑tune a small open‑source model (like GPT‑2 or Llama 3 8B) on your custom dataset.
Even if you don’t know Python, just copy the code – we explain every line.

Step 1: Prepare your data

Create a JSON file train.jsonl where each line is:

```json
{"prompt": "Translate English to French: Hello ->", "completion": " Bonjour"}
```

Step 2: Install libraries

```bash
pip install transformers datasets accelerate torch
```

Step 3: Fine‑tuning script (finetune.py)

```python
from transformers import AutoModelForCausalLM, AutoTokenizer, Trainer, TrainingArguments, DataCollatorForLanguageModeling
from datasets import load_dataset

# 1. Load model and tokenizer (we use GPT‑2 small for demo)
model_name = "gpt2"
tokenizer = AutoTokenizer.from_pretrained(model_name)
tokenizer.pad_token = tokenizer.eos_token
model = AutoModelForCausalLM.from_pretrained(model_name)

# 2. Load dataset from the JSON file
dataset = load_dataset("json", data_files="train.jsonl", split="train")

# 3. Tokenize function
def tokenize_function(examples):
    texts = [p + c for p, c in zip(examples["prompt"], examples["completion"])]
    return tokenizer(texts, truncation=True, max_length=512, padding="max_length")

tokenized_dataset = dataset.map(tokenize_function, batched=True)

# 4. Training arguments
training_args = TrainingArguments(
    output_dir="./my-finetuned-model",
    per_device_train_batch_size=4,
    num_train_epochs=3,
    save_steps=500,
    logging_steps=100,
    evaluation_strategy="no",
    save_total_limit=1,
)

# 5. Data collator (no labels needed, model uses input_ids as labels)
data_collator = DataCollatorForLanguageModeling(tokenizer=tokenizer, mlm=False)

# 6. Trainer
trainer = Trainer(
    model=model,
    args=training_args,
    train_dataset=tokenized_dataset,
    data_collator=data_collator,
)

trainer.train()
trainer.save_model("./my-finetuned-model")
```

Run it: python finetune.py. After training, you have a new model folder ./my-finetuned-model.

8.3 Using the Fine‑tuned Model in Java

You can load the fine‑tuned model in Java via ONNX Runtime or Deep Java Library (DJL).
The easiest way: serve the model using a simple REST API (e.g., transformers inference script) and call it from Java.

Serving script (serve.py):

```python
from transformers import pipeline
generator = pipeline("text-generation", model="./my-finetuned-model", tokenizer="gpt2")
# You could wrap this in a Flask app
```

Then in Java:

```java
// Use any HTTP client to POST a prompt and get the response
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("http://localhost:5000/generate"))
    .header("Content-Type", "application/json")
    .POST(HttpRequest.BodyPublishers.ofString("{\"prompt\": \"Translate to French: Hello ->\"}"))
    .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

Alternatively, use DJL to load the model directly in Java (example with PyTorch format):

```java
import ai.djl.ModelZoo;
import ai.djl.repository.zoo.Criteria;
import ai.djl.training.util.ProgressBar;
// DJL supports HuggingFace models via its model zoo.
```

However, DJL’s HuggingFace integration is evolving; serving the model as a microservice is the pragmatic choice.

8.4 Fine‑tuning Directly in Java? (Yes, with DJL)

DJL can perform fine‑tuning for some architectures, but it’s more limited and complex than Python. For most teams, it’s more efficient to fine‑tune in Python and consume the model in Java.

---

10. Part 9: Production Tips and Common Pitfalls

· Always set a temperature – 0 for factual answers, >0 for creativity.
· Token limits – monitor and truncate long conversations.
· Prompt injection – treat user input as untrusted; validate and sanitize.
· Caching – cache embeddings and LLM responses to save cost.
· Streaming – use streaming responses (model.stream(...) in LangChain4j) for better UX.
· Local models – use Ollama with LangChain4j (OllamaChatModel) to avoid API costs during development.

---

11. Resources and Where to Go Next

· LangChain4j documentation: https://docs.langchain4j.dev
· Spring AI: https://spring.io/projects/spring-ai
· MCP specification: https://modelcontextprotocol.io
· Hugging Face course: https://huggingface.co/learn
· OpenAI API reference: https://platform.openai.com/docs

Now you have a complete toolkit. Start building your own AI‑powered Java applications today!
