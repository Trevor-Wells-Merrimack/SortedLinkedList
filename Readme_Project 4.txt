
--------------------------------------------------
How to Compile (from the Command Line):
--------------------------------------------------
1. Open your terminal or command prompt.
2. Navigate to the folder where you saved SortedLinkedList.java.
   - Example (macOS/Linux):
     cd ~/Desktop
   - Example (Windows Command Prompt):
     cd %USERPROFILE%\Desktop

3. Run:
   javac SortedLinkedList.java

This creates a file called SortedLinkedList.class.

--------------------------------------------------
How to Run:
--------------------------------------------------
After compiling, run the program with:

   java SortedLinkedList

Then follow the prompt. For example:

   Enter one integer at a time and press Enter after each entry.
   To stop entering numbers, type any non-integer (like 'x') and press Enter.

Example input:
10
5
3
7
x

Expected output:
Sorted Linked List:
3 5 7 10

--------------------------------------------------
How to Generate Javadoc:
--------------------------------------------------
To generate HTML documentation, run:

   javadoc SortedLinkedList.java -d doc

This will create a "doc" folder with `index.html` that can be opened in a browser.


