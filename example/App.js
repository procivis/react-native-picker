import React, { Component } from 'react';
import { Button, View, StyleSheet, ScrollView, Text, TouchableOpacity, TouchableHighlight } from 'react-native';
import SearchInput, { createFilter } from 'react-native-search-filter';
import DeviceInfo from 'react-native-device-info';
import DatePicker from 'react-native-date-picker-x';
import locales from './locales';
import MinimalExample from './MinimalExample';
import ExtendedExample from './ExtendedExample';

const MINIMAL_EXAMPLE = 'MINIMAL_EXAMPLE';
const EXTENDED_EXAMPLE = 'EXTENDED_EXAMPLE';

const examples = {
  [MINIMAL_EXAMPLE]: {
    buttonTitle: 'Show minimal example',
    component: <MinimalExample />
  },
  [EXTENDED_EXAMPLE]: {
    buttonTitle: 'Show extended example',
    component: <ExtendedExample />
  }
}

export default class App extends Component {

  state = { picker: undefined }

  render() {
    return (
      <View style={styles.container}>
        {!this.state.picker && this.renderButtons()}
        {!!this.state.picker && this.renderBackButton()}
        {!!this.state.picker && this.renderPicker()}
      </View>
    );
  }

  renderPicker = () => examples[this.state.picker].component

  renderButtons = () =>
    Object.keys(examples)
      .filter(key => key !== this.state.picker)
      .map(this.renderButton)

  renderButton = (key) => (
    <TouchableOpacity
      key={key}
      onPress={() => this.setState({ picker: key })}
      style={{ margin: 10 }}
    >
      <Text style={styles.text}>{examples[key].buttonTitle}</Text>
    </TouchableOpacity>
  )

  renderBackButton = (key) => (
    <TouchableOpacity
      onPress={() => this.setState({ picker: undefined })}
      style={{ margin: 10 }}
    >
      <Text style={styles.text}>Back</Text>
    </TouchableOpacity>
  )

}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    // justifyContent: 'center',
    backgroundColor: 'white',
    marginTop: 15,
  },
  text: {
    color: 'dodgerblue',
    fontSize: 16,
  }
})
