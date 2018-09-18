package easySoft.co.id.uccapi;

import android.app.Activity;
import android.widget.ImageView;

/**
 * Created by Rio on 9/18/2018.
 */

public class UCCService {
    /**
     *
     * @param mainActivity
     * @param uccCallback
     * @param userID
     * @return true if
     */
    public static final boolean startUCCService(Activity mainActivity, UCCCallback uccCallback, String userID){
        SharedObj.uccCallback = uccCallback;
        SharedObj.uccLibCallback = new easySoft.co.id.ucclib.UCCCallback() {
            @Override
            public void messagingReceive(String sUserId, String sMessage) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.messagingReceive(sUserId, sMessage);
            }

            @Override
            public void messagingSent(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.messagingSent(s);
            }

            @Override
            public void messagingDelivered(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.messagingDelivered(s);
            }

            @Override
            public void messagingRead(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.messagingRead(s);
            }

            @Override
            public void audioCallConnecting(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.audioCallConnecting(s);
            }

            @Override
            public void audioCallAnswered(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.audioCallAnswered(s);
            }

            @Override
            public void audioCallBusy(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.audioCallBusy(s);
            }

            @Override
            public void audioCallDisconnected(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.audioCallDisconnected(s);
            }

            @Override
            public void audioCallReceive(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.audioCallReceive(s);
            }

            @Override
            public void videoCallConnecting(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.videoCallConnecting(s);
            }

            @Override
            public void videoCallAnswered(String s, int i) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.videoCallAnswered(s, i);
            }

            @Override
            public void videoCallBusy(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.videoCallBusy(s);
            }

            @Override
            public void videoCallDisconnected(String s, int i) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.videoCallDisconnected(s, i);
            }

            @Override
            public void videoCallReceive(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.videoCallReceive(s);
            }

            @Override
            public void videoCallSwitchCamera(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.videoCallSwitchCamera(s);
            }

//            @Override
//            public void conferenceRoomJoined(String s) {
//                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.conferenceRoomJoined(s);
//            }
//
//            @Override
//            public void conferenceRoomLeft(String s) {
//                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.conferenceRoomLeft(s);
//            }
//
//            @Override
//            public void conferenceRoomRequestToSpeak(String s) {
//                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.conferenceRoomRequestToSpeak(s);
//            }
//
//            @Override
//            public void conferenceRoomSelectedSpeaker(String s) {
//                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.conferenceRoomSelectedSpeaker(s);
//            }
//
//            @Override
//            public void conferenceRoomDisconnected(String s) {
//                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.conferenceRoomDisconnected(s);
//            }

            @Override
            public void liveStreamingJoined(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.liveStreamingJoined(s);
            }

            @Override
            public void liveStreamingLeft(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.liveStreamingLeft(s);
            }

            @Override
            public void liveStreamingMeDisconnected() {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.liveStreamingMeDisconnected();
            }

            @Override
            public void liveStreamingOtherDisconnected(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.liveStreamingOtherDisconnected(s);
            }

            @Override
            public void screenSharingMeDisconnected() {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.screenSharingMeDisconnected();
            }

            @Override
            public void screenSharingOtherDisconnected(String s) {
                if (SharedObj.uccCallback!=null) SharedObj.uccCallback.screenSharingOtherDisconnected(s);
            }
        };
        return easySoft.co.id.ucclib.UCCService.startUCCService(mainActivity, SharedObj.uccLibCallback, userID);
    }

    /**
     *
     */
    public static final class Messaging {

        /**
         *
         * @param userId
         * @param message
         * @return sMessageId or null if failed
         * @throws Exception
         */
        public static String send(String userId, String message) throws Exception {
            return easySoft.co.id.ucclib.UCCService.Messaging.send(userId, message);
        }

    }

    /**
     * AudioCall
     */
    public static final class AudioCall {

        public static boolean initiate(String sUserId){
            return easySoft.co.id.ucclib.UCCService.AudioCall.initiate(sUserId);
        }

        public static boolean answer(){
            return easySoft.co.id.ucclib.UCCService.AudioCall.answer();
        }

        public static boolean reject(){
            return easySoft.co.id.ucclib.UCCService.AudioCall.reject();
        }

        public static boolean end(String sUserId){
            return easySoft.co.id.ucclib.UCCService.AudioCall.end(sUserId);
        }

        public static boolean endAllCall(){
            return easySoft.co.id.ucclib.UCCService.AudioCall.endAllCall();
        }

        public static boolean addCall(String sUserId){
            return easySoft.co.id.ucclib.UCCService.AudioCall.addCall(sUserId);
        }

    }

    /**
     * VideoCall
     */
    public static final class VideoCall {

        public static boolean initiate(String sUserId, ImageView[] ivRemoteViewVC, CameraView cameraView){
            return easySoft.co.id.ucclib.UCCService.VideoCall.initiate(sUserId, ivRemoteViewVC, cameraView.getCLMCameraView());
        }

        public static boolean answer(ImageView[] ivRemoteViewVC, CameraView cameraView){
            return easySoft.co.id.ucclib.UCCService.VideoCall.answer(ivRemoteViewVC, cameraView.getCLMCameraView());
        }

        public static boolean reject(){
            return easySoft.co.id.ucclib.UCCService.VideoCall.reject();
        }

        public static boolean end(String sUserId){
            return easySoft.co.id.ucclib.UCCService.VideoCall.end(sUserId);
        }

        public static boolean endAllCall(){
            return easySoft.co.id.ucclib.UCCService.VideoCall.endAllCall();
        }

        public static boolean addCall(String sUserId){
            return easySoft.co.id.ucclib.UCCService.VideoCall.addCall(sUserId);
        }

    }

    /**
     * Live Streaming
     */
    public static final class LiveStreaming{

        public static boolean initiate(String sTitle, boolean bFrontCamera, CameraView cameraView){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.initiate(sTitle, bFrontCamera, cameraView.getCLMCameraView());
        }

        public static boolean startView(String sUserId, ImageView imageView){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.startView(sUserId, imageView);
        }

        public static boolean setAudio(String sUserId, boolean bOnOff){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.setAudio(sUserId, bOnOff);
        }

        public static boolean stopView(String sUserId){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.stopView(sUserId);
        }

        public static boolean stopViewAll(){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.stopViewAll();
        }

        public static boolean terminate(){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.terminate();
        }

        public static String getList(){
            return easySoft.co.id.ucclib.UCCService.LiveStreaming.getList();
        }
    }

    /**
     * Screen Sharing
     */
    public static final class ScreenSharing{
        public static boolean initiate(String sTitle, int iScreenWidth, int iScreenHeight, int iScreenDPI){
            return easySoft.co.id.ucclib.UCCService.ScreenSharing.initiate(sTitle, iScreenWidth, iScreenHeight, iScreenDPI);
        }

        public static boolean startView(String sUserId, ImageView imageView){
            return easySoft.co.id.ucclib.UCCService.ScreenSharing.startView(sUserId, imageView);
        }

        public static boolean terminate(){
            return easySoft.co.id.ucclib.UCCService.ScreenSharing.terminate();
        }
    }

    public static final class Others {
        public static boolean speakerPhone(boolean bSpeaker){
            return easySoft.co.id.ucclib.UCCService.Others.speakerPhone(bSpeaker);
        }
        public static String sGetVersion(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetVersion();
        }
        public static String sGetConnMode(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetConnMode();
        }
        public static String sGetConnStat(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetConnStat();
        }
        public static String sGetLocInfo(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetLocInfo();
        }
        public static String sGetOperatorCode(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetOperatorCode();
        }
        public static String sGetCheckResult(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetCheckResult();
        }
        public static String sGetCurentUserID(){
            return easySoft.co.id.ucclib.UCCService.Others.sGetCurentUserID();
        }
        public static boolean bInetConnAvailable(){
            return easySoft.co.id.ucclib.UCCService.Others.bInetConnAvailable();
        }
        public static byte nGetCLXConnState(){
            return easySoft.co.id.ucclib.UCCService.Others.nGetCLXConnState();
        }

    }
}
