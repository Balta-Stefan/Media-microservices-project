package pisio.common.model.messages;


import lombok.Data;
import lombok.EqualsAndHashCode;
import pisio.common.model.DTOs.Resolution;
import pisio.common.model.enums.ProcessingProgress;
import pisio.common.model.enums.ProcessingType;

@Data
@EqualsAndHashCode(callSuper = true)
public class ExtractAudioMessage extends BaseMessage
{
    public ExtractAudioMessage(){}
    public ExtractAudioMessage(String messageQueueID,
                               String processingID,
                               Integer userID,
                               String username,
                               String bucket,
                               String object,
                               String processedObjectName,
                               String fileName,
                               ProcessingProgress progress)
    {
        super(messageQueueID, processingID, userID, username, bucket, object, processedObjectName, fileName, progress, ProcessingType.EXTRACT_AUDIO);
    }

    public ExtractAudioMessage(BaseMessage msg)
    {
        super(msg);
    }
}
