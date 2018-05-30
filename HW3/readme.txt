Name: 張碩恩
Student ID: 404410053

執行方法：
1. 將antlr-3.5.2-complete.jar放置於同一個資料夾內，使用makefile便可執行
2. 如要使用input01.c的檔案，可使用make test1指令，input02為make test2
   以此類推共有4個測試檔
3. test1 test2預期為沒有任何error提示的
   test3 test4這分別會出現不同類型的錯誤，以便測試程式的功能可正常使用
   （對程式來說因為不會處理include檔，所以使用函式時會出現not define）
4. 可使用make clear，整理編譯出來的檔案
5. 程式執行結束會印出DONE!!，沒其他error就代表完成分析了。
6. 若要印出結果可將.g檔中的TRACEON設為true
