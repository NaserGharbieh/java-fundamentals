# Linter Functionalities

## The `App` class contains 3 main functionalities:

### 1. Weather Data Analysis
The `analyzeWeatherData` method takes a 2D array representing temperature data and generates a summary of the temperatures. It calculates the highest and lowest temperatures and identifies temperatures that were not seen.

- The method takes temperature data as input.
- It calculates the highest and lowest temperatures.
- It identifies temperatures that were not seen during the given data range.
- The returned result is a summary including the highest and lowest temperatures and any missing temperatures.


### 2. JavaScript Linter
The `checkForMissingSemicolons` method reads a JavaScript file line by line and checks for missing semicolons at the end of lines that are not empty, don't end with curly braces, don't contain "if" or "else" statements, and don't already end with a semicolon.

- The method takes a path to a JavaScript file as input.
- It reads the file line by line.
- For each line that is not empty, doesn't end with curly braces, doesn't contain "if" or "else," and doesn't end with a semicolon, it prints an error message indicating a missing semicolon for that line.
- The printed output shows the line number and the error message for each line with a missing semicolon.

### 3. Vote Tallying
The `tally` method calculates the winner of a voting process based on the list of candidate names.
- The method takes a list of candidate names as input.
- It processes the list of votes and counts the number of votes each candidate received.
- It determines the candidate with the highest number of votes and returns the name of the winning candidate.

## Testing
In the `AppTest` class, JUnit tests have been created to cover the behavior of these methods:

- `testAnalyzeWeatherData`: Tests the behavior of the `analyzeWeatherData` method by providing temperature data and checking if the generated output matches the expected summary.
- `testTally`: Tests the behavior of the `tally` method by providing a list of votes and checking if the returned winner matches the expected winner.
- `testCheckForMissingSemicolons_NoErrors`, `testCheckForMissingSemicolons_OneError`, `testCheckForMissingSemicolons_FewErrors`, `testCheckForMissingSemicolons_ManyErrors`, `testCheckForMissingSemicolons_EmptyFile`: These tests simulate running the `checkForMissingSemicolons` method on different JavaScript files with various scenarios. The captured output is compared to the expected output.

When users run the JUnit tests in the `AppTest` class, they can expect to see test results indicating whether the actual behavior of the methods matches the expected behavior. If there are any mismatches, the test results will provide details on what went wrong, helping users identify and fix issues in their code.
