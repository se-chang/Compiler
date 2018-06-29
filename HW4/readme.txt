Name: 張碩恩
Student ID: 404410053

執行方法：
1. 將antlr-3.5.2-complete.jar放置於同一個資料夾內，使用makefile便可執行
2. 如要使用input01.c的檔案，可使用make test1指令，input02為make test2
   以此類推共有3個測試檔
3. .s檔會留在原本的資料夾中，有需要可以做確認
4. 如果有錯誤訊息(如type error)，程式會將錯誤資訊輸出到.s檔中，因此程式便無法執行
5. 可使用make clear，整理編譯出來的檔案