package com.yh.middleware.sdk.infrastructure.openai;


import com.yh.middleware.sdk.infrastructure.openai.dto.ChatCompletionRequestDTO;
import com.yh.middleware.sdk.infrastructure.openai.dto.ChatCompletionSyncResponseDTO;

/**
 * @Description
 * @Author fanyiheng
 * @Date 2026/10/11 15:20
 */
public interface IOpenAI {
    ChatCompletionSyncResponseDTO completions(ChatCompletionRequestDTO requestDTO) throws Exception;

}
