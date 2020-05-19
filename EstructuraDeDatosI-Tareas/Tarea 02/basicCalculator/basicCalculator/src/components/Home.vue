<template>
    <div class="home">
        <h1>{{ msg }}</h1>
        <p>Welcome to your new single-page application, built with <a href="https://vuejs.org" target="_blank">Vue.js</a> and <a href="http://www.typescriptlang.org/" target="_blank">TypeScript</a>.</p><hr style="height: 10px; background-color: black;" color="Black"/>
        <p>Type the first number</p>
        <p><input v-model.number="Number1" placeholder="1st Number" /></p>
        <p>Type the second number</p>
        <p><input v-model.number="Number2" placeholder="2nd Number" /></p><hr color="Turquoise"  />
        <p><button class="button" @click="sum">Process sum operation</button></p>
        <span>The sum result is: {{ Sum }}</span><hr color="pink" />
        <p><button class="button" @click="subtraction">Process subtraction operation</button></p>
        <span>The subtraction result is: {{ Subtraction }}</span><hr color="blue" />
        <p><button class="button" @click="multiplication">Process multiplication operation</button></p>
        <span>The multiplication result is: {{ Multiplication }}</span><hr color="yellow" />
        <p><button class="button" @click="division">Process division operation</button></p>
        <span>The division result is: {{ Division }}</span><hr color="red" />
    </div>
</template>

<script lang="ts">
    import { Component, Prop, Vue } from 'vue-property-decorator';

    @Component
    export default class Home extends Vue {
        @Prop() private msg!: string;
        //Defining variables
        Number1: number = 0
        Number2: number = 0
        Sum: number = 0
        Subtraction: number = 0
        Multiplication: number = 0
        Division: number = 0
        //Creating functions for the basic operations
        sum() {
            this.Sum = this.Number1 + this.Number2
        }
        subtraction() {
            this.Subtraction = this.Number1 - this.Number2
        }
        multiplication() {
            this.Multiplication = this.Number1 * this.Number2
        }
        division() {
            this.Division = this.Number1 / this.Number2
        }
    }
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    .button {
        border: solid;
        border-radius: 5px;
        background-color: #45a20d;
        font-size: 15px;
    }
</style>
