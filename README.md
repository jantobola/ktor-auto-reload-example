# Ktor Auto-Reload Example

This project demonstrates how Ktor auto-reload works during development.

## How to Test Auto-Reload

To test the development auto-reload, you need to run two tasks. It is recommended to use two separate terminal windows or tabs:

1. **Start the continuous compiler watcher** (monitors files and compiles code changes automatically on save):
   ```bash
   ./gradlew -t kotlinCompile
   ```

2. **Start the Ktor application**:
   ```bash
   ./gradlew run
   ```

## Verifying the Reload

1. Open your browser and navigate to the default port: [http://localhost:8082](http://localhost:8082).
2. Open the main application source file: [Application.kt](file:///Users/toby/workspace/bitbyone/ktor-auto-reload-example/src/main/kotlin/one/bitby/example/Application.kt).
3. Change the text content inside any of the `h1` blocks (for example, change `"Hello page."` to `"Hello Ktor Auto-Reload!"`).
4. Save the file. The continuous build (`kotlinCompile`) will automatically recompile the classes, and Ktor will reload them on the fly.
5. Refresh your browser page to see the updated heading content.