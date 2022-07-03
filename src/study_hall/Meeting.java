package study_hall;

import java.lang.reflect.Array;
import java.util.*;


public class Meeting {

    private int startTime;
    private int endTime;

    public Meeting(int startTime, int endTime) {
        // number of 30 min blocks past 9:00 am
        this.startTime = startTime;
        this.endTime   = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public static Meeting[] whenEveryonesFree(Meeting[] meetings) {

        // if start time of second is in between start and end date of first meeting.
        //Meeting(3, 5),Meeting(4, 8)

        Meeting[] scheduledMeetings = new Meeting[meetings.length];
//        Meeting[] sortedMeetings = new Meeting[meetings.length];

        for (int i = 0; i < meetings.length -1; i++) {
            if (meetings[i + 1].startTime < meetings[i].startTime && meetings[i + 1].endTime > meetings[i].endTime) {

                scheduledMeetings[i].startTime = meetings[i].startTime;
                scheduledMeetings[i].endTime = meetings[i + 1].endTime;
            }
        }


        return meetings;
    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings) {

        // make a copy so we don't destroy the input
        List<Meeting> sortedMeetings = new ArrayList<>();
        for (Meeting meeting: meetings) {
            Meeting meetingCopy = new Meeting(meeting.getStartTime(), meeting.getEndTime());
            sortedMeetings.add(meetingCopy);
        }

        // sort by start time
        Collections.sort(sortedMeetings, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting m1, Meeting m2) {
                return m1.getStartTime() - m2.getStartTime();
            }
        });

        // initialize mergedMeetings with the earliest meeting
        List<Meeting> mergedMeetings = new ArrayList<>();
        mergedMeetings.add(sortedMeetings.get(0));

        for (Meeting currentMeeting : sortedMeetings) {

            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);

            // if the current meeting overlaps with the last merged meeting, use the
            // later end time of the two
            if (currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()) {
                lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(), currentMeeting.getEndTime()));

                // add the current meeting since it doesn't overlap
            } else {
                mergedMeetings.add(currentMeeting);
            }
        }

        return mergedMeetings;
    }


    public static void main(String[] args) {

        Meeting[] arrayOfMeetings = new Meeting[5];
        arrayOfMeetings[0] = new Meeting(0,1);
        arrayOfMeetings[1] = new Meeting(3,5);
        arrayOfMeetings[2] = new Meeting(4,8);
        arrayOfMeetings[3] = new Meeting(10,12);
        arrayOfMeetings[4] = new Meeting(9,10);

        for (int i = 0; i < arrayOfMeetings.length; i++) {
            System.out.println(arrayOfMeetings[i].getStartTime());
        }

        whenEveryonesFree(arrayOfMeetings);

//        for (int i = 0; i < arrayOfMeetings.length; i++) {
//            if(arrayOfMeetings[i].getStartTime() ==)
//
//
//        }

     }
}


