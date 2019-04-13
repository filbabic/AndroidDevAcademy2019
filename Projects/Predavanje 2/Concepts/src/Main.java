public class Main {

    public static void main(String[] args) {
        final JavaSpeaker speakerObject = new JavaSpeaker() {
            @Override
            public void speak() {

            }
        };

        speakerObject.speak();
    }

    interface JavaSpeaker {

        void speak();
    }

    class JavaPerson implements JavaSpeaker {

        @Override
        public void speak() {

        }
    }
}
