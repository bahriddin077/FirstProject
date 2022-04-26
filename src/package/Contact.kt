package `package`

    class Contact {

        private var name: String? = null
        private var number: String? = null

        constructor(name: String?, number: String?) {
            this.name = name
            this.number = number
        }
        constructor()

        fun getName(): String? {
            return name
        }

        fun setName(name: String?) {
            this.name = name
        }

        fun getNumber(): String? {
            return number
        }

        fun setNumber(number: String?) {
            this.number = number
        }

        override fun toString(): String {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    '}'
        }
    }

