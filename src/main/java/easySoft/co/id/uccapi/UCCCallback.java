package easySoft.co.id.uccapi;

/**
 * Created by Rio on 9/18/2018.
 */

public interface UCCCallback {
    /**
     * Messaging Callback
     */
    public void messagingReceive(String sUserID, String sMessage);
    public void messagingSent(String sMessageId);
    public void messagingDelivered(String sMessageId);
    public void messagingRead(String sMessageId);

    /**
     * AudioCall Callback
     */
    public void audioCallConnecting(String sUserId);
    public void audioCallAnswered(String sUserId);
    public void audioCallBusy(String sUserId);
    public void audioCallDisconnected(String sUserId);
    public void audioCallReceive(String sUserId);

    /**
     * VideoCall Callback
     */
    public void videoCallConnecting(String sUserId);
    public void videoCallAnswered(String sUserId, int iIndex);
    public void videoCallBusy(String sUserId);
    public void videoCallDisconnected(String sUserId, int iIndex);
    public void videoCallReceive(String sUserId);
    public void videoCallSwitchCamera(String sUserId);

//    /**
//     * ConferenceRoom Callback
//     */
//    public void conferenceRoomJoined(String sUserId);
//    public void conferenceRoomLeft(String sUserId);
//    public void conferenceRoomRequestToSpeak(String sUserId);
//    public void conferenceRoomSelectedSpeaker(String sUserId);
//    public void conferenceRoomDisconnected(String sUserId);

    /**
     * LiveStreaming Callback
     * A=Broadcaster
     * B=viewer
     */
//    public void liveStreamingMeStarted();
//    public void liveStreamingOtherStarted(String sUserId);
    public void liveStreamingJoined(String sUserId);
    public void liveStreamingLeft(String sUserId);
    public void liveStreamingMeDisconnected();
    public void liveStreamingOtherDisconnected(String sUserId);

    /**
     * ScreenSharing Callback
     * A=Broadcaster
     * B=viewer
     */
    public void screenSharingMeDisconnected();
    public void screenSharingOtherDisconnected(String sUserId);
}
