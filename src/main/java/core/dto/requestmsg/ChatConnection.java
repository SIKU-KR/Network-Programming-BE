package core.dto.requestmsg;

import java.io.Serializable;

public class ChatConnection {
    private Integer userId;
    private Integer chatId;

    public ChatConnection() {
    }

    public ChatConnection(Integer userId, Integer chatId) {
        this.userId = userId;
        this.chatId = chatId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getChatId() {
        return chatId;
    }
}
