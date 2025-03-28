Message Management System
這是一個消息管理系統，主要功能包括添加、刪除、更新、顯示以及搜尋消息。專案中已經實現了基於 JUnit 的單元測試，用於測試系統中的各項功能，確保系統穩定且無錯誤。

目錄結構
以下是主要的 Java 類和其功能說明：

AddMessage.java: 用於添加消息，並對測試進行重構。

DeleteMessage.java: 用於刪除消息，並對測試進行重構。

Message.java: 定義消息物件的結構，該類目前無消息。

MessageBoard.java: 記錄所有消息，並對測試進行重構。

MessageService.java: 定義消息服務邏輯，該類目前無消息。

ResultMessage.java: 返回結果消息的類，該類目前無消息。

SearchMessage.java: 用於搜尋消息，並對測試進行重構。

ShowAllMessage.java: 顯示所有消息，並對測試進行重構。

UpdateMessage.java: 更新消息。

單元測試
專案已經設置好單元測試，這些測試基於 JUnit 框架，涵蓋了各個操作（添加、刪除、更新、搜尋、顯示）的正確性。

測試類別
AddMessageTest: 測試添加消息的邏輯。

DeleteMessageTest: 測試刪除消息的邏輯。

SearchMessageTest: 測試搜尋消息的邏輯。

UpdateMessageTest: 測試更新消息的邏輯。

ShowAllMessageTest: 測試顯示所有消息的邏輯。

MessageBoardTest: 測試消息板功能，確保消息正確顯示與管理。

