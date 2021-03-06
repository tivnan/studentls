package cn.tivnan.studentls.bean;

public class Review {
    private Integer teacherId;

    private Integer noteId;

    private Integer timeId;

    public Review() {
    }

    public Review(Integer teacherId, Integer noteId, Integer timeId) {
        this.teacherId = teacherId;
        this.noteId = noteId;
        this.timeId = timeId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public Integer getNoteId() {
        return noteId;
    }

    public void setNoteId(Integer noteId) {
        this.noteId = noteId;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }
}