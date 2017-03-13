package ${packageName}.models.states;

import android.os.Parcel;

public class ${stateClass} extends BaseState {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte(this.firstRun ? (byte) 1 : (byte) 0);
    }

    public ${stateClass}() {
    }

    protected ${stateClass}(Parcel in) {
        this.firstRun = in.readByte() != 0;
    }

    public static final Creator<${stateClass}> CREATOR = new Creator<${stateClass}>() {
        @Override
        public ${stateClass} createFromParcel(Parcel source) {
            return new ${stateClass}(source);
        }

        @Override
        public ${stateClass}[] newArray(int size) {
            return new ${stateClass}[size];
        }
    };
}
